package com.lcdlv;

import java.time.DayOfWeek;
import java.util.List;

public class Meal {

    public static long countColdMeals(List<CheckIn> meals) {
        if (meals.isEmpty())
            return 0;
        else
            return meals.stream().filter(CheckIn::isColdMeal).count();
    }

    public static int countColdMealsFromCSV(String checkIn) {
        return 0;
        // countColdMeals()
    }
}
