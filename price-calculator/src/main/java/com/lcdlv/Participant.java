package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.ChoiceType.*;
import static java.time.DayOfWeek.*;

public class Participant {
    private String name;
    private DayOfWeek arrivalDay;
    private LocalTime arrivalHour;
    private DayOfWeek departureDay;
    private LocalTime departureHour;
    private ChoiceType roomType;

    public Participant(String name, DayOfWeek arrivalDay, LocalTime arrivalHour, DayOfWeek departureDay, LocalTime departureHour, ChoiceType roomType) {
        this.name = name;
        this.arrivalDay = arrivalDay;
        this.arrivalHour = arrivalHour;
        this.departureDay = departureDay;
        this.departureHour = departureHour;
        this.roomType = roomType;
    }

    int process() {
        if (this.roomType.isTwin()) {
            if (this.departureDay.equals(SATURDAY)) {
                return this.roomType.getPrice() - 40;
            }
            return TWIN.getPrice();
        } else if (this.roomType.equals(TRIPLE)) {
            if (this.arrivalDay.equals(FRIDAY)) {
                return this.roomType.getPrice() - 40;
            }
            return TRIPLE.getPrice();
        } else if (this.roomType.equals(NO_ACCOMMODATION)) {
            return this.roomType.getPrice();
        } else {
            return SINGLE.getPrice();
        }
    }

    @Override
    public String toString() {
        return this.name + ";" + this.arrivalDay + ";" + this.arrivalHour + ";" + this.departureDay
                + ";" + this.departureHour + ";" + this.roomType.getType();
    }
}
