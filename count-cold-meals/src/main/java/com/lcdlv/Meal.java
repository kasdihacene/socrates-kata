package com.lcdlv;

import java.util.List;

public class Meal {

    public static long countColdMeals(List<CheckIn> meals) {
        return meals.stream().filter(CheckIn::isColdMeal).count();
    }

    public static long countColdMealsFromCSV(String checkInCSV) {
        return countColdMeals(ParserCheckIn.parseCsvMeals(checkInCSV));
    }

}
