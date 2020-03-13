package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.util.ParserConstantsUtil.*;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.valueOf;


public class CheckOut {

    public LocalTime departureHour;
    public DayOfWeek departureDay;

    public CheckOut(String[] departureInformation) {
        departureDay = valueOf(departureInformation[DAY_INDEX].toUpperCase());
        departureHour = LocalTime.parse(departureInformation[HOUR_INDEX].toLowerCase().replace(HOUR_CHAR, REPLACEMENT));
    }

    public boolean isDepartureOnSaturday() {
        return departureDay.equals(SATURDAY);
    }
}
