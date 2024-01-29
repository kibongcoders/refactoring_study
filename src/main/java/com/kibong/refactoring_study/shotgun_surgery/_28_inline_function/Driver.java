package com.kibong.refactoring_study.shotgun_surgery._28_inline_function;

public class Driver {

    private int numberOfLateDeliveries;

    public Driver(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    public int getNumberOfLateDeliveries() {
        return this.numberOfLateDeliveries;
    }
}