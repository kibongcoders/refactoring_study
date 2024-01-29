package com.kibong.refactoring_study.shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public double getDiscountRate() {
        return contract.getDiscountRate();
    }

    public void becomePreferred() {
        contract.setDiscountRate(getDiscountRate() + 0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(contract.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
