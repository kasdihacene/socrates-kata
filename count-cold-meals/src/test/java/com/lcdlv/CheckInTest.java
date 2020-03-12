package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckInTest {

    @Test
    public void coldMeal_whenParticipantArriveAt21() {
        // Arrange
        CheckIn checkIn1 = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(21, 0));
        //Act
        boolean isCold = checkIn1.isColdMeal();
        //Assert
        assertThat(isCold).isTrue();
    }

    @Test
    public void coldMeal_WhenParticipantArriveAt22() {
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(22, 0));
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();
    }

    @Test
    public void coldMeal_WhenParticipantArriveAt23() {
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(23, 0));
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();
    }

    @Test
    public void noColdMeal_WhenParticipantArriveAt20() {
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(20, 0));
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isFalse();
    }

    @Test
    public void noColdMealWhenParticipantComesThursdayAt18() {
        String checkIn = "Philippe Dupont;Thursday 18h00;Sunday 16h";
        int coldMeals = Meal.countColdMealsFromCSV(checkIn);
        assertThat(coldMeals).isEqualTo(0);
    }
}
