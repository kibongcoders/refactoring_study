package com.kibong.refactoring_study.mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

public class ReadingClient {

    private double baseRate(Month month, Year year) {
        return 10;
    }

    private double taxThreshold(Year year) {
        return 5;
    }

    protected EnrichReading enrichReading(Reading reading){
        return new EnrichReading(reading, calculateBaseCharge(reading), calculateTaxThreshold(reading));
    }

    private double calculateBaseCharge(Reading reading) {
        return baseRate(reading.month(), reading.year()) * reading.quantity();
    }

    private double calculateTaxThreshold(Reading reading){
        return  Math.max(0, calculateBaseCharge(reading) - taxThreshold(reading.year()));
    }
}
