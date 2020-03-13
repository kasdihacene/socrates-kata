package com.lcdlv;

import java.time.DayOfWeek;
import java.time.LocalTime;

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

    public DayOfWeek getDepartureDay() {
        return departureDay;
    }


    @Override
    public String toString() {
        return this.name+";"+this.arrivalDay+";"+this.arrivalHour+";"+this.departureDay
                +";"+this.departureHour+";"+this.roomType.getType();
    }
}
