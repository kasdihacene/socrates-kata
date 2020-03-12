package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class SocratesTest {

    @Test
    public void checkIn_whenColdMeal() {
        // Arrange
        CheckIn checkIn1 = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(21, 0));
        //Act
        boolean isCold = checkIn1.isColdMeal();
        //Assert
        assertThat(isCold).isTrue();
    }

    @Test
    public void checkIn_WhenColdMealAt22() {
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(22, 0));
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();
    }

    @Test
    public void checkIn_WhenColdMealAt23() {
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(23, 0));
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();
    }

    @Test
    public void checkIn_WhenColdMealAt20() {
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(20, 0));
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isFalse();
    }

    @Test
    public void countColdMealsWhenEmptyList() {
        long countColdMeals = Meal.countColdMeals(new ArrayList<>());
        assertThat(countColdMeals).isEqualTo(0);
    }

    @Test
    public void countColdMealsWhenOneElement(){
        CheckIn checkIn = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(20, 0));
        long countColdMeals = Meal.countColdMeals(Collections.singletonList(checkIn));
        assertThat(countColdMeals).isEqualTo(0);
    }

    @Test
    public void countColdMealsWhenTwoElements(){
        CheckIn checkIn1 = new CheckIn(DayOfWeek.FRIDAY, LocalTime.of(21, 0));
        CheckIn checkIn2 = new CheckIn(DayOfWeek.THURSDAY, LocalTime.of(22, 0));
        long countColdMeals = Meal.countColdMeals(Arrays.asList(checkIn1, checkIn2));
        assertThat(countColdMeals).isEqualTo(1);
    }
}
