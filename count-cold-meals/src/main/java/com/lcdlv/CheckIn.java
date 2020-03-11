package com.lcdlv;

public class CheckIn {

    private String day;
    private int hour;

    public CheckIn(String day, int hour) {
        this.day = day;
        this.hour = hour;
    }

    public boolean isColdMeal() {
        return this.day.contains("J") && hour == 21;
    }
}
