package com.lcdlv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {

    public static final int SINGLE_ROOM_PRICE = 610;

    @Test
    public void payCompletePriceWithSingleChoice() {

        String pierre = "Pierre;Thursday 20;Sunday 14;Single";
        int participationPrice = PriceCalculator.calculateParticipationPrice(pierre);
        assertThat(participationPrice).isEqualTo(SINGLE_ROOM_PRICE);
    }
}
