package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.util.ParserConstantsUtil.*;
import static java.time.DayOfWeek.FRIDAY;


public class CheckIn {

    public LocalTime arrivalHour;
    public DayOfWeek arrivalDay;

    public CheckIn(String[] arrivalInformation) {
        arrivalDay = DayOfWeek.valueOf(arrivalInformation[DAY_INDEX].toUpperCase());
        arrivalHour = LocalTime.parse(arrivalInformation[HOUR_INDEX].toLowerCase().replace(HOUR_CHAR, REPLACEMENT));
    }

    public boolean isArrivalOnFriday() {
        return arrivalDay.equals(FRIDAY);
    }
}
