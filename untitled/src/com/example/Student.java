package com.example;

public class Student extends Person{
    public int year;
    public int subjects;


    public Student(double weight, double height, String name, int year, int subjects) {
        super(weight, height, name);
        this.year = year;
        this.subjects = subjects;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student: " +
                "weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", subjects=" + subjects;
    }
}
