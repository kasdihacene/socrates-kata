package com.lcdlv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WithoutOneMealPriceTest {

    public static final int SINGLE_ROOM_PRICE = 610;
    public static final int TWIN_ROOM_PRICE = 510;
    public static final int TRIPLE_ROOM_PRICE = 410;
    public static final int NO_ACCOMMODATION_PRICE = 240;
    public static final int MEAL_PRICE = 40;

    @Test
    public void payPartialPriceWithoutOneMealWithTripleChoice(){
        String margaux = "margaux;Friday 21;Sunday 16;Triple";
        int participationPrice = PriceCalculator.calculateParticipationPrice(margaux);
        assertThat(participationPrice).isEqualTo(TRIPLE_ROOM_PRICE - MEAL_PRICE);
    }
}
