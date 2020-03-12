package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class ParserCheckIn {

    public static CheckIn getDayOfWeek(String checkInCSV) {
        String[] token = checkInCSV.split(";");
        String arrivalDayAndHour = token[1];
        String[] values = arrivalDayAndHour.split(" ");
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(values[0].toUpperCase());
        LocalTime hour = LocalTime.parse(values[1].toLowerCase().replace("h",":"));
        return new CheckIn(dayOfWeek, hour);
    }
}
