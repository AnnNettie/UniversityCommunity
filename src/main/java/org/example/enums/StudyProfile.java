package org.example.enums;

public enum StudyProfile {
    UNKNOWN ("Неизвестный"),
    MEDICINE ("Медицина"),
    CHEMISTRY ("Химия"),
    MATHEMATICS ("Математика"),
    HISTORY ("История"),
    PHYSICS ("Физика"),
    LINGUISTICS ("Лингвистика");

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
