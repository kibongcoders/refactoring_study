package com.kibong.refactoring_study.mutable_data._20_remove_setting_method;

public class Person {

    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
