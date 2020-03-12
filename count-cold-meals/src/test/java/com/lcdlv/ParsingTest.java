package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class ParsingTest {
    @Test
    public void checkIfColdMealWhenParticipantComesThursdayAt21() {
        String checkInCSV = "Philippe Dupont;Thursday 21h00;Sunday 16h";
        CheckIn checkIn = ParserCheckIn.getDayOfWeek(checkInCSV);
        assertThat(checkIn.isColdMeal()).isTrue();
    }

}
