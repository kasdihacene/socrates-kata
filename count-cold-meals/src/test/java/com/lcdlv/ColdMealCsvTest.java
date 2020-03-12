package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class ColdMealCsvTest {
    @Test
    public void noColdMealWhenParticipantComesThursdayAt18() {
        String checkIn = "Philippe Dupont;Thursday 18h00;Sunday 16h";
        int coldMeals = Meal.countColdMealsFromCSV(checkIn);
        assertThat(coldMeals).isEqualTo(0);
    }
}
