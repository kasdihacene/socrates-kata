package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class ColdMealCheckInTest {

    @Test
    public void zeroColdMeals_WhenEmptyList() {
        long countColdMeals = Meal.countColdMeals(new ArrayList<>());
        assertThat(countColdMeals).isEqualTo(0);
    }

    @Test
    public void zeroColdMeal_WhenOneParticipant_At20(){
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(20, 0));
        long countColdMeals = Meal.countColdMeals(Collections.singletonList(checkIn));
        assertThat(countColdMeals).isEqualTo(0);
    }

    @Test
    public void oneColdMeal_WhenOneParticipantsComesThursday_AndOtherComesFriday(){
        CheckIn checkIn1 = new CheckIn(DayOfWeek.FRIDAY, LocalTime.of(21, 0));
        CheckIn checkIn2 = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(22, 0));
        long countColdMeals = Meal.countColdMeals(Arrays.asList(checkIn1, checkIn2));
        assertThat(countColdMeals).isEqualTo(1);
    }
}
