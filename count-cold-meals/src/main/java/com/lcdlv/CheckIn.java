package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CheckIn {

    private DayOfWeek day;
    private LocalTime hour;

    public CheckIn(DayOfWeek day, LocalTime hour) {
        this.day = day;
        this.hour = hour;
    }

    public boolean isColdMeal() {
        if (day.equals(DayOfWeek.THURSDAY)) {
            return hour.isAfter(LocalTime.of(20, 59))
                    && hour.isBefore(LocalTime.of(23, 59))
                    || hour.equals(LocalTime.of(23, 59));
        }
        return false;
    }
}
