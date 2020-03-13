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

    @Test
    public void payPartialPriceWithoutOneMealWithSingleChoice(){
        String bertrand = "Bertrand;Friday 09h00;Sunday 14h00;Single";
        int participationPrice = PriceCalculator.calculateParticipationPrice(bertrand);
        assertThat(participationPrice).isEqualTo(SINGLE_ROOM_PRICE - MEAL_PRICE);
    }


    @Test
    public void payPartialPriceWithoutOneMealWithNoAccommodationChoice(){
        String lea = "Lea;Thursday 18h00;Saturday 22h00;No Accommodation";
        int participationPrice = PriceCalculator.calculateParticipationPrice(lea);
        assertThat(participationPrice).isEqualTo(NO_ACCOMMODATION_PRICE - MEAL_PRICE);
    }


}
