package com.kibong.refactoring_study.primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 80;
    }
}
