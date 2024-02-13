package com.kibong.refactoring_study.large_class.extract_superclass;

import lombok.Getter;

public abstract class Party {

    @Getter
    protected String name;
    private double monthlyCost;

    public Party(String name) {
        this.name = name;
    }

    public double annualCost() {
        return this.monthlyCost * 12;
    }

    protected abstract double monthlyCost();
}
