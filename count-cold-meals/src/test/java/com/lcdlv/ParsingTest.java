package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParsingTest {
    @Test
    public void checkIfColdMealWhenParticipantComesThursdayAt21() {
        String checkInCSV = "Philippe Dupont;Thursday 21h00;Sunday 16h";
        CheckIn checkIn = ParserCheckIn.buildCheckIn(checkInCSV);
        assertThat(checkIn.isColdMeal()).isTrue();
    }

    @Test
    public void checkIfColdMealWhenParticipantComesThursdayAt20() {
        String checkInCSV = "Philippe Dupont;Thursday 20h00;Sunday 16h";
        CheckIn checkIn = ParserCheckIn.buildCheckIn(checkInCSV);
        assertThat(checkIn.isColdMeal()).isFalse();
    }

    @Test
    public void check_MealsCsvInputs() {
        String checkInCSV = "Philippe Dupont;Thursday 20h00;Sunday 16h\n"
                + "Philippe Dupont;Thursday 20h00;Sunday 16h\n"
                + "Philippe Dupont;Friday 21h00;Sunday 16h\n"
                + "Philippe Dupont;Thursday 22h00;Sunday 16h\n"
                + "Philippe Dupont;Thursday 20h50;Sunday 16h";
        List<CheckIn> checkIns = ParserCheckIn.parseCsvMeals(checkInCSV);
        assertThat(checkIns).hasSize(5);
    }

}
