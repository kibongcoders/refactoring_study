package com.kibong.refactoring_study.refused_bequest;

public class Salesman extends Employee {
    protected Quota quota;
    protected Quota getQuota() {
        return new Quota();
    }
}

