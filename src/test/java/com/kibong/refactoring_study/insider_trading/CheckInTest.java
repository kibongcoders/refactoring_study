package com.kibong.refactoring_study.insider_trading;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckInTest {

    @Test
    void isFastPass() {
        CheckIn checkIn = new CheckIn();
        assertTrue(new Ticket(LocalDate.of(2021, 12, 31), true).isFastPass());
        assertFalse(new Ticket(LocalDate.of(2021, 12, 31), false).isFastPass());
        assertFalse(new Ticket(LocalDate.of(2022, 1, 2), true).isFastPass());
    }

}