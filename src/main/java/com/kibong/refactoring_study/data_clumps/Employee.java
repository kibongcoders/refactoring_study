package com.kibong.refactoring_study.data_clumps;

public class Employee {

    private String name;
    private TelephoneNumber employeeTelePhoneNumber;

    public Employee(String name, TelephoneNumber employeeTelePhoneNumber) {
        this.name = name;
        this.employeeTelePhoneNumber = employeeTelePhoneNumber;
    }

    public String personalPhoneNumber() {
        return employeeTelePhoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalAreaCode() {
        return employeeTelePhoneNumber.getPersonalAreaCode();
    }

    public String getPersonalNumber() {
        return employeeTelePhoneNumber.getPersonalNumber();
    }
}
