package org.example;

import org.example.comparators.StudentComparator;
import org.example.comparators.UniversityComparator;
import org.example.enums.StudentComparatorEnum;
import org.example.enums.UniversityComparatorEnum;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<University> ulist = new ArrayList<>();
        List<Student> slist = new ArrayList<>();

        System.out.println("Унивенрситеты");
        if(ReadDataXLS.ReadUniversity(ulist) == true) {
            if(!ulist.isEmpty()){
                UniversityComparator unCom =
                        ComparatorsFunc.getUniversityComparator(UniversityComparatorEnum.FULLNAME);
                ulist.stream()
                        .sorted(unCom)
                        .forEach(System.out::println);
            }
            else System.out.println("Массив с университетами нулевой!");
        }
        else
            System.out.println("Проблема с чтением данных Университетов");

        System.out.println("Студенты");
        if(ReadDataXLS.ReadStudents(slist) == true) {
           if(!slist.isEmpty()){
               StudentComparator stCom =
                       ComparatorsFunc.getStudentComparator(StudentComparatorEnum.FULLNAME);
               slist.stream()
                       .sorted(stCom)
                       .forEach(System.out::println);
            }
            else System.out.println("Массив со студентами нулевой!");
        }
        else
            System.out.println("Проблема с чтением данных Студентов");
    }
}