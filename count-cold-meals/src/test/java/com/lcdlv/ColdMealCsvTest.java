package com.lcdlv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ColdMealCsvTest {
    @Test
    public void countColdMeals_WhenCsvInputs_OneColdMealFound() {
        String checkInCSV = "Philippe Dupont;Thursday 20h00;Sunday 16h\n"
                + "Philippe Dupont;Thursday 20h00;Sunday 16h\n"
                + "Philippe Dupont;Friday 21h00;Sunday 16h\n"
                + "Philippe Dupont;Thursday 22h00;Sunday 16h\n"
                + "Philippe Dupont;Thursday 20h50;Sunday 16h";

        long coldMeals = Meal.countColdMealsFromCSV(checkInCSV);
        assertThat(coldMeals).isEqualTo(1);
    }
}
