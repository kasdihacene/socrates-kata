package com.lcdlv;

import java.util.List;

public class Meal {
    public static long countColdMeals(List<CheckIn> meals) {
        if (meals.isEmpty())
            return 0;
        else
            return meals.stream().filter(CheckIn::isColdMeal).count();
    }
}
