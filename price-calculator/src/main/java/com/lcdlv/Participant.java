package com.lcdlv;

import static com.lcdlv.ChoiceType.*;
import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.SATURDAY;

public class Participant {
    public static final int MEAL_PRICE = 40;
    private String name;
    private CheckIn checkIn;
    private CheckOut checkOut;
    private ChoiceType roomType;


    public Participant(String name, CheckIn checkIn, CheckOut checkOut, ChoiceType roomType) {
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomType = roomType;
    }

    int process() {
        if (this.roomType.isTwin()) {
            if (this.checkOut.departureDay.equals(SATURDAY)) {
                return this.roomType.getPrice() - MEAL_PRICE;
            }
            return TWIN.getPrice();
        } else if (this.roomType.isTriple()) {
            if (this.checkIn.arrivalDay.equals(FRIDAY)) {
                return this.roomType.getPrice() - MEAL_PRICE;
            }
            return TRIPLE.getPrice();
        } else if (this.roomType.isNoAccommodation()) {
            return this.roomType.getPrice();
        } else {
            return SINGLE.getPrice();
        }
    }

    @Override
    public String toString() {
        return this.name + ";" + this.checkIn.arrivalDay + ";" + this.checkIn.arrivalHour + ";" + this.checkOut.departureDay
                + ";" + this.checkOut.departureHour + ";" + this.roomType.getType();
    }
}
