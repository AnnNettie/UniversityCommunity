package org.example;

import org.example.comparators.*;
import org.example.enums.StudentComparatorEnum;
import org.example.enums.UniversityComparatorEnum;

public class ComparatorsFunc {
    public ComparatorsFunc() {
    }

    public static StudentComparator getStudentComparator(StudentComparatorEnum compareParam) {

        switch (compareParam) {

            case FULLNAME:
                return new StudentFullNameComparator();
            case UNIVERSITYID:
                //noinspection DuplicateBranchesInSwitch
                return new StudentUniversityIdComparator();
            case CURRENTCOURSENUMBER:
                return new StudentCurrentCourseNumberComparator();
            case AVGEXAMSCORE:
                return new StudenrAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorEnum compareParam) {

        switch (compareParam) {

            case ID:
                return new UniversityIdComparator();
            case FULLNAME:
                //noinspection DuplicateBranchesInSwitch
                return new UniversityFullNameComparator();
            case SHORTNAME:
                return new UniversityShortNameComparator();
            case YEAROFFOUNDATION:
                return new UniversityYearOfFoundationComparator();
            case MAINPROFILE:
                return new UniversityMainProfileComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
