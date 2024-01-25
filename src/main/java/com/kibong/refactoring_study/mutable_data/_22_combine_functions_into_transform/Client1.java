package com.kibong.refactoring_study.mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

public class Client1 extends ReadingClient {
    private double baseCharge;
    public Client1(Reading reading) {
        this.baseCharge = enrichReading(reading).baseCharge();
    }

    private double baseRate(Month month, Year year) {
        return 10;
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
