package com.kibong.refactoring_study.middle_man.replace_subclass_with_delegate;

import java.util.List;

public class Show {

    private List<String> properties;

    private double price;

    public Show(List<String> properties, double price) {
        this.properties = properties;
        this.price = price;
    }

    public boolean hasOwnProperty(String property) {
        return this.properties.contains(property);
    }

    public double getPrice() {
        return price;
    }
}
