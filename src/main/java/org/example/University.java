package org.example;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    public String id() {
        return id;
    }

    public String fullName() {
        return fullName;
    }

    public String shortName() {
        return shortName;
    }

    public int yearOfFoundation() {
        return yearOfFoundation;
    }

    public StudyProfile mainProfile() {
        return mainProfile;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }

    @Override
    public String toString() {
        return String.format("id = %s, fullName = %s, shortName = %s, yearOfFoundation = %d, mainProfile = %s", id, fullName, shortName, yearOfFoundation, mainProfile.toString());
    }
}