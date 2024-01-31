package com.kibong.refactoring_study.data_clumps;

public class Office {

    private String location;
    private TelephoneNumber officeTelephoneNumber;

    public Office(String location, TelephoneNumber officeTelephoneNumber) {
        this.location = location;
        this.officeTelephoneNumber = officeTelephoneNumber;
    }

    public String officePhoneNumber() {
        return officeTelephoneNumber.toString();
    }

    public String getOfficeAreCode() {
        return officeTelephoneNumber.getPersonalAreaCode();
    }

    public String getOfficeNumber() {
        return officeTelephoneNumber.getPersonalNumber();
    }
}
