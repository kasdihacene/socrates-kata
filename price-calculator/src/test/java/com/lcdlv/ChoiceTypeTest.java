package com.lcdlv;

import org.junit.jupiter.api.Test;

import static com.lcdlv.ChoiceType.*;
import static org.assertj.core.api.Assertions.assertThat;

class ChoiceTypeTest {


    @Test
    public void choiceIsTwin() {
        assertThat(TWIN.isTwin()).isTrue();
        assertThat(SINGLE.isTwin()).isFalse();
    }

    @Test
    void choiceIsTriple() {
        assertThat(TRIPLE.isTriple()).isTrue();
        assertThat(SINGLE.isTriple()).isFalse();
    }

    @Test
    void isNoAccommodation() {
        assertThat(NO_ACCOMMODATION.isNoAccommodation()).isTrue();
        assertThat(SINGLE.isNoAccommodation()).isFalse();

    }
}