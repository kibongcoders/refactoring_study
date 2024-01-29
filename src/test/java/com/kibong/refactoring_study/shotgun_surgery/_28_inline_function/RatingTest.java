package com.kibong.refactoring_study.shotgun_surgery._28_inline_function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RatingTest {

    @Test
    void rating() {
        Rating rating = new Rating();
        assertEquals(2, rating.rating(new Driver(15)));
        assertEquals(1, rating.rating(new Driver(3)));
    }

}