package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.util.ParserConstantsUtil.HOUR_CHAR;
import static com.lcdlv.util.ParserConstantsUtil.REPLACEMENT;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.valueOf;


public class CheckOut {

    public LocalTime departureHour;
    public DayOfWeek departureDay;

    public CheckOut(String[] departureInformation) {
        departureDay = valueOf(departureInformation[0].toUpperCase());
        departureHour = LocalTime.parse(departureInformation[1].toLowerCase().replace(HOUR_CHAR, REPLACEMENT));
    }

    public boolean isDepartureOnSaturday() {
        return departureDay.equals(SATURDAY);
    }
}
