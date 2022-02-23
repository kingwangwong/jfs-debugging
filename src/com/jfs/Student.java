package com.jfs;

import java.time.LocalDate;

public class Student {
    private String name;
    private String email;
    private LocalDate dob;
    private double gpa;



    public Student(String email, String name, LocalDate dob, double gpa) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gpa = gpa;
    }


    public String getName() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public double getDob() {
        return gpa;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
