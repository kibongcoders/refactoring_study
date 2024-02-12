package com.kibong.refactoring_study.middle_man.replace_subclass_with_delegate;

import java.time.LocalDateTime;

public class PremiumBooking extends Booking {

    private PremiumExtra extra;

    public PremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        super(show, time);
        this.extra = extra;
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.isPeakDay();
    }
}
