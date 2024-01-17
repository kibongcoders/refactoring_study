package com.kibong.refactoring_study.global_data._17_encapsulate_variable;

public class Home {

    public static void main(String[] args) {
        Thermostats thermostats = new Thermostats();
        System.out.println(thermostats.getTargetTemperature());
        thermostats.setTargetTemperature(600);
        thermostats.setReadInFahrenheit(false);
    }
}
