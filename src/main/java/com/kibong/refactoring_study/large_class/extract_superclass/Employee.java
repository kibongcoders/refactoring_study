package com.kibong.refactoring_study.large_class.extract_superclass;

import lombok.Getter;

public class Employee extends Party{

    @Getter
    private Integer id;
    private double monthlyCost;

    public Employee(String name) {
        super(name);
    }

    @Override
    protected double monthlyCost() {
        return monthlyCost;
    }


}
