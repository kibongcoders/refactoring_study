package com.kibong.refactoring_study.temporary_field.introduce_special_case;

public class NullPaymentHistory extends PaymentHistory{
    public NullPaymentHistory() {
        super(0);
    }
}
