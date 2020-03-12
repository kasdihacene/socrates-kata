package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SocratesTest {

    @Test
    public void checkIn_whenColdMeal() {
        // Arrange
        CheckIn checkIn1 = new CheckIn("J", 21);
        //Act
        boolean isCold = checkIn1.isColdMeal();
        //Assert
        assertThat(isCold).isTrue();
    }

    @Test
    public void checkIn_WhenColdMealAt22() {
        CheckIn checkIn = new CheckIn("J", 22);
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();
    }

    @Test
    public void checkIn_WhenColdMealAt23() {
        CheckIn checkIn = new CheckIn("J", 23);
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();
    }

    @Test
    public void checkIn_WhenColdMealAt20() {
        CheckIn checkIn = new CheckIn("J", 20);
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isFalse();
    }

    @Test
    public void countColdMealsWhenEmptyList() {
        int countColdMeals = Meal.countColdMeals(new ArrayList<>());
        assertThat(countColdMeals).isEqualTo(0);
    }
}
