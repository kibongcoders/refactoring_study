package com.kibong.refactoring_study.comments.introduce_assertion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerTest {

    @Test
    void createDiscountRate(){
        Customer customer = new Customer();
        customer.setDiscountRate(-10d);
    }
}