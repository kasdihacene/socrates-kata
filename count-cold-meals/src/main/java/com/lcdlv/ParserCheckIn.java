package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParserCheckIn {

    public static CheckIn buildCheckIn(String checkInCSV) {
        String[] token = checkInCSV.split(";");
        String arrivalDayAndHour = token[1];
        String[] values = arrivalDayAndHour.split(" ");
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(values[0].toUpperCase());
        LocalTime hour = LocalTime.parse(values[1].toLowerCase().replace("h", ":"));
        return new CheckIn(dayOfWeek, hour);
    }

    public static List<CheckIn> parseCsvMeals(String participants) {
        String[] inputs = participants.split("\n");
        return Arrays.stream(inputs).map(ParserCheckIn::buildCheckIn).collect(Collectors.toList());
    }
}
