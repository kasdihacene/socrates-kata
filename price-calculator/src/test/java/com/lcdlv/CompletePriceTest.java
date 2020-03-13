package com.lcdlv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompletePriceTest {

    public static final int SINGLE_ROOM_PRICE = 610;
    public static final int TWIN_ROOM_PRICE = 510;
    public static final int TRIPLE_ROOM_PRICE = 410;
    public static final int NO_ACCOMMODATION_PRICE = 240;

    @Test
    public void payCompletePriceWithSingleChoice() {

        String pierre = "Pierre;Thursday 20h00;Sunday 14h00;Single";
        int participationPrice = PriceCalculator.calculateParticipationPrice(pierre);
        assertThat(participationPrice).isEqualTo(SINGLE_ROOM_PRICE);
    }

    @Test
    public void payCompletePriceWithTwinChoice(){
        String mila = "Mila;Thursday 18h00;Sunday 15h00;Twin";
        int participationPrice = PriceCalculator.calculateParticipationPrice(mila);
        assertThat(participationPrice).isEqualTo(TWIN_ROOM_PRICE);
    }

    @Test
    public void payCompletePriceWithTripleChoice(){
        String john = "John;Thursday 18h00;Sunday 15h00;Triple";
        int participationPrice = PriceCalculator.calculateParticipationPrice(john);
        assertThat(participationPrice).isEqualTo(TRIPLE_ROOM_PRICE);
    }

    @Test
    public void payCompletePriceWithNoAccommodationChoice(){
        String arnaud = "Arnaud;Thursday 18h00;Sunday 15h00;No Accommodation";
        int participationPrice = PriceCalculator.calculateParticipationPrice(arnaud);
        assertThat(participationPrice).isEqualTo(NO_ACCOMMODATION_PRICE);
    }
}
