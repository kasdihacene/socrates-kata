package com.lcdlv;

public class CheckIn {

    private String day;
    private int hour;

    public CheckIn(String day, int hour) {
        this.day = day;
        this.hour = hour;
    }

    public boolean isColdMeal() {
        if (day.equals("J")) {
            if (hour == 21 || hour == 22 || hour == 0)
                return true;
        }
        return false;
    }
}
