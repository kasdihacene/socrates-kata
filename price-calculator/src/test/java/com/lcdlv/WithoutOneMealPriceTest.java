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
        String margaux = "Margaux;Friday 21h00;Sunday 16h00;Triple";
        int participationPrice = PriceCalculator.calculateParticipationPrice(margaux);
        assertThat(participationPrice).isEqualTo(TRIPLE_ROOM_PRICE - MEAL_PRICE);
    }

    @Test
    public void payPartialPriceWithoutOneMealWithTwinChoice(){
        String ines = "Ines;Thursday 22h00;Saturday 21h00;Twin";
        int participationPrice = PriceCalculator.calculateParticipationPrice(ines);
        assertThat(participationPrice).isEqualTo(TWIN_ROOM_PRICE - MEAL_PRICE);
    }


}
