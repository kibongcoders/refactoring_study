package com.kibong.refactoring_study.message_chains.hide_delegate;

public class Department {

    private String chargeCode;

    private Person manager;

    public Department(String chargeCode, Person manager) {
        this.chargeCode = chargeCode;
        this.manager = manager;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public Person getManager() {
        return manager;
    }
}
