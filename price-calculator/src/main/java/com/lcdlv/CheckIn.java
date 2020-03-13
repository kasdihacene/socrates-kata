package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.util.ParserConstantsUtil.HOUR_CHAR;
import static com.lcdlv.util.ParserConstantsUtil.REPLACEMENT;
import static java.time.DayOfWeek.FRIDAY;


public class CheckIn {

    public LocalTime arrivalHour;
    public DayOfWeek arrivalDay;

    public CheckIn(String[] arrivalInformation) {
        arrivalDay = DayOfWeek.valueOf(arrivalInformation[0].toUpperCase());
        arrivalHour = LocalTime.parse(arrivalInformation[1].toLowerCase().replace(HOUR_CHAR, REPLACEMENT));
    }

    public boolean isArrivalOnFriday() {
        return arrivalDay.equals(FRIDAY);
    }
}
