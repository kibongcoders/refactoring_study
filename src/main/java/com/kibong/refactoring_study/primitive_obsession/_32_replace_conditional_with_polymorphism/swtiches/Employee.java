package com.kibong.refactoring_study.primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

public abstract class Employee {

    private String type;

    protected List<String> availableProjects;

    public Employee(String type, List<String> availableProjects) {
        this.type = type;
        this.availableProjects = availableProjects;
    }

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public Employee() {
    }

    public abstract int vacationHours();

    public boolean canAccessTo(String project) {
        return this.availableProjects.contains(project);
    }
}
