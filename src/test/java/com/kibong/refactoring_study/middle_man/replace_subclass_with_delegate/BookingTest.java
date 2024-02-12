package com.kibong.refactoring_study.middle_man.replace_subclass_with_delegate;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void talkback() {
        Show noTalkbackShow = new Show(List.of(), 120);
        Show aladin = new Show(List.of("talkback"), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);

        assertFalse(new Booking(noTalkbackShow, weekday).hasTalkback());
        assertTrue(new Booking(aladin, weekday).hasTalkback());
        assertFalse(new Booking(aladin, weekend).hasTalkback());

        PremiumExtra premiumExtra = new PremiumExtra(List.of(), 50);
        assertTrue(Booking.createPremiumBooking(aladin, weekend, premiumExtra).hasTalkback());
        assertFalse(Booking.createPremiumBooking(noTalkbackShow, weekend, premiumExtra).hasTalkback());
    }

    @Test
    void basePrice_on_peakDay() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);

        Booking booking = Booking.createBooking(lionKing, weekend);
        assertEquals(138, booking.basePrice());

        Booking premium = Booking.createPremiumBooking(lionKing, weekend, new PremiumExtra(List.of(), 50));
        assertEquals(188, premium.basePrice());
    }
    @Test
    void basePrice() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);

        Booking booking = new Booking(lionKing, weekday);
        assertEquals(120, booking.basePrice());

        Booking premium = new PremiumBooking(lionKing, weekday, new PremiumExtra(List.of(), 50));
        assertEquals(170, premium.basePrice());
    }

    @Test
    void hasDinner() {
        Show lionKing = new Show(List.of(), 120);
        LocalDateTime weekday = LocalDateTime.of(2022, 1, 20, 19, 0);
        LocalDateTime weekend = LocalDateTime.of(2022, 1, 15, 19, 0);
        PremiumExtra premiumExtra = new PremiumExtra(List.of("dinner"), 50);

        assertTrue(Booking.createPremiumBooking(lionKing, weekday, premiumExtra).hasDinner());
        assertFalse(Booking.createPremiumBooking(lionKing, weekend, premiumExtra).hasDinner());
    }

}