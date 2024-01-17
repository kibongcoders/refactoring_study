package com.kibong.refactoring_study._04_long_parameter_list._15_remove_flag_argument;

import com.kibong.refactoring_study.long_parameter_list._15_remove_flag_argument.Order;
import com.kibong.refactoring_study.long_parameter_list._15_remove_flag_argument.Shipment;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipmentTest {

    @Test
    void deliveryDate() {
        LocalDate placedOn = LocalDate.of(2021, 12, 15);
        Order orderFromWA = new Order(placedOn, "WA");

        Shipment shipment = new Shipment();
        assertEquals(placedOn.plusDays(1), shipment.rushDeliveryDate(orderFromWA));
        assertEquals(placedOn.plusDays(2), shipment.regularDeliveryDate(orderFromWA));
    }

}