package org.example;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.example.enums.StudyProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ReadDataXLS {

    private ReadDataXLS() {
    }

    public static boolean ReadStudents() throws IOException{
        return false;
    }

    public static boolean ReadUniversity(List<University> list) throws IOException {
        XSSFSheet sheet = ReadPageXLS("Университеты");
        if(sheet == null)
            return false;

        Iterator<Row> iter = sheet.iterator();
        iter.next();
        while(iter.hasNext()){
            Row row = iter.next();
            list.add( new University( row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue(), row.getCell(2).getStringCellValue(), (int) row.getCell(3).getNumericCellValue(), GetStudyProfile(row.getCell(4).getStringCellValue()) ) );

        }
        return true;
    }

    public static boolean ReadStudents(List<Student> list) throws IOException {
        XSSFSheet sheet = ReadPageXLS("Студенты");
        if(sheet == null)
            return false;

        Iterator<Row> iter = sheet.iterator();
        iter.next();
        while(iter.hasNext()){
            Row row = iter.next();
            list.add( new Student( row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue(), (int) row.getCell(2).getNumericCellValue(), (float) row.getCell(3).getNumericCellValue() ) );
        }
        return true;
    }

    public static StudyProfile GetStudyProfile(String str){
        StudyProfile sp;
        if (str != null) {
            try {
                sp = StudyProfile.valueOf(str);
            }
            catch(IllegalArgumentException e){
                System.out.println("Нет такого предмета в списке предметов!");
                sp = StudyProfile.UNKNOWN;
            }
            return sp;
        }
        else
            return StudyProfile.UNKNOWN;
    }

    public static XSSFSheet ReadPageXLS(String pageName) throws IOException{
        File file = new File("src/main/res/universityinfo.xlsx");
        if(!file.exists())
        {
            System.out.printf("Не найден файл с базой данных!");
            return null;
        }

        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(pageName);
        if(sheet == null)
        {
            System.out.printf("Страница %s в XLSX файле не найдена!\n", pageName);
            return null;
        }
        return sheet;
    }
}
