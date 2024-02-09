package com.kibong.refactoring_study.speculative_generality.remove_dead_code;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservationTest {
    @Test
    void reservation() {
        Reservation reservation = new Reservation(
                "tennis",
                LocalDateTime.of(2022, 1, 20, 19, 30),
                LocalDateTime.of(2022, 1, 20, 9, 0));
        reservation.setAlarmBefore(30);
        assertEquals(LocalDateTime.of(2022, 1, 20, 19, 0), reservation.getAlarm());
    }

}