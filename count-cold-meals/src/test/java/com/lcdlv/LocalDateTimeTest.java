package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    @Test
    public void createNewDateUsingLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(2020, 10, 22, 21, 30);
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println(dayOfWeek.name());
        System.out.println(dateTime);
        System.out.println(LocalTime.of(21,1));
        System.out.println(DayOfWeek.SATURDAY);
        System.out.println(DayOfWeek.SATURDAY);
    }
}
