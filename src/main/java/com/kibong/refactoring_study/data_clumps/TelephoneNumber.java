package com.kibong.refactoring_study.data_clumps;

public class TelephoneNumber {

    private String personalAreaCode;
    private String personalNumber;

    public String getPersonalAreaCode() {
        return personalAreaCode;
    }

    public void setPersonalAreaCode(String personalAreaCode) {
        this.personalAreaCode = personalAreaCode;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return this.personalAreaCode + "-" + this.personalNumber;
    }
}
