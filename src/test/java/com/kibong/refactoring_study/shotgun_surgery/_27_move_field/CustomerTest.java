package com.kibong.refactoring_study.shotgun_surgery._27_move_field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void applyDiscount() {
        Customer customer = new Customer("keesun", 0.5);
        assertEquals(50, customer.applyDiscount(100));

        customer.becomePreferred();
        assertEquals(47, customer.applyDiscount(100));
    }

}