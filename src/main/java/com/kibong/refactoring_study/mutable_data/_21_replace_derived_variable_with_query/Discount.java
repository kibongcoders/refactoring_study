package com.kibong.refactoring_study.mutable_data._21_replace_derived_variable_with_query;

public class Discount {

    private double discountedTotal;
    private double discount;

    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
        return this.baseTotal - this.discountedTotal;
    }

    public void setDiscount(double number) {
        this.discount = number;
    }
}
