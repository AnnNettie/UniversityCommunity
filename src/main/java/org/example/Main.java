package org.example;
public class Main {
    public static void main(String[] args) {
        University university = new University("4578", "Государственный университет высоких искуств", "ГУВИ", 1970, StudyProfile.MEDICINE);
        Student student = new Student("Елизавета Петрова", "4578", 5, 4.7f);
        System.out.println(university.toString());
        System.out.println(student.toString());
    }
}