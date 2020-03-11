package com.lcdlv;

import org.junit.jupiter.api.Test;

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
    public void checkIn_WhenColdMealAt2() {
        CheckIn checkIn = new CheckIn("J", 0);
        boolean coldMeal = checkIn.isColdMeal();
        assertThat(coldMeal).isTrue();

    }
}
