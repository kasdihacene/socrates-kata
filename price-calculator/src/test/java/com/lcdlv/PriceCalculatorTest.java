package com.lcdlv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {

    public static final int SINGLE_ROOM_PRICE = 610;
    public static final int TWIN_ROOM_PRICE = 510;
    public static final int TRIPLE_ROOM_PRICE = 410;

    @Test
    public void payCompletePriceWithSingleChoice() {

        String pierre = "Pierre;Thursday 20;Sunday 14;Single";
        int participationPrice = PriceCalculator.calculateParticipationPrice(pierre);
        assertThat(participationPrice).isEqualTo(SINGLE_ROOM_PRICE);
    }

    @Test
    public void payCompletePriceWithTwinChoice(){
        String mila = "Mila;Thursday 18;Sunday 15;Twin";
        int participationPrice = PriceCalculator.calculateParticipationPrice(mila);
        assertThat(participationPrice).isEqualTo(TWIN_ROOM_PRICE);
    }

    @Test
    public void payCompletePriceWithTripleChoice(){
        String john = "John;Thursday 18;Sunday 15;Triple";
        int participationPrice = PriceCalculator.calculateParticipationPrice(john);
        assertThat(participationPrice).isEqualTo(TRIPLE_ROOM_PRICE);
    }
}
