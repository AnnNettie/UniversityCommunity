package org.example;

public enum StudyProfile {
    MEDICINE ("Медицина"),
    CHEMISTRY ("Химия"),
    MATHEMATICS ("Математика"),
    HISTORY ("История"),
    PHYSICS ("Физика");

    public String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        return profileName;
    }
}
