package com.lcdlv;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckOutTest {

    @Test
    void isDepartureOnSaturday() {
        CheckOut checkOut = new CheckOut(new String[]{"SATURDAY", "14:00"});
        assertThat(checkOut.isDepartureOnSaturday()).isTrue();
    }
}