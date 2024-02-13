package com.kibong.refactoring_study.large_class.extract_superclass;

import java.util.List;

public class Department extends Party {

    private List<Employee> staff;

    public Department(String name) {
        super(name);
    }

    public List<Employee> getStaff() {
        return staff;
    }

    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(Employee::monthlyCost).sum();
    }
    @Override
    public double annualCost() {
        return this.monthlyCost() * 12;
    }

    public int headCount() {
        return this.staff.size();
    }
}
