package org.example.comparators;

import org.apache.commons.lang3.StringUtils;
import org.example.University;

public class UniversityMainProfileComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getShortName().toString(), o2.getShortName().toString());
    }
}
