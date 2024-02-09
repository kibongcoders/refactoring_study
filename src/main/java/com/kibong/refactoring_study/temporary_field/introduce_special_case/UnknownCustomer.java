package com.kibong.refactoring_study.temporary_field.introduce_special_case;

public class UnknownCustomer extends Customer{

    public UnknownCustomer() {
        super("unknown", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    public boolean isUnknown() {
        return true;
    }

    @Override
    public String getName() {
        return "occupant";
    }
}
