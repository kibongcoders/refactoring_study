package com.kibong.refactoring_study.divergent_change._25_move_function;

public class Account {

    private int daysOverdrawn;

    private AccountType type;

    public double getBankCharge() {
        double result = 4.5;
        if (this.daysOverdrawn() > 0) {
            result += this.type.overdraftCharge(daysOverdrawn());
        }
        return result;
    }

    private int daysOverdrawn() {
        return this.daysOverdrawn;
    }

}
