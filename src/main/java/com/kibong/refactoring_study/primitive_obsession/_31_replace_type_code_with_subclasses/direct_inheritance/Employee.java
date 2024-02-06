package com.kibong.refactoring_study.primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import java.util.List;

public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(String name, String type){
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException("존재하지 않는 직원 타입 입니다.");
        };
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
