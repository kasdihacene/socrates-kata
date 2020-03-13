package com.lcdlv;

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
        if (checkOut.isDepartureOnSaturday() || checkIn.isArrivalOnFriday()) {
            return computePriceWithoutAMeal();
        } else {
            return this.roomType.getPrice();
        }
    }

    private int computePriceWithoutAMeal() {
        return this.roomType.getPrice() - MEAL_PRICE;
    }

    @Override
    public String toString() {
        return this.name + ";" + this.checkIn.arrivalDay + ";" + this.checkIn.arrivalHour + ";" + this.checkOut.departureDay
                + ";" + this.checkOut.departureHour + ";" + this.roomType.getType();
    }
}
