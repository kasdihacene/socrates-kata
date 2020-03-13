package com.lcdlv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckInTest {

    @Test
    void isArrivalOnFriday() {
        CheckIn checkIn = new CheckIn(new String[]{"FRIDAY", "14:00"});
        assertThat(checkIn.isArrivalOnFriday()).isTrue();
    }
}