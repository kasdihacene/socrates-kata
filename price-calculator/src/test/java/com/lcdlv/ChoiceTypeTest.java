package com.lcdlv;

import org.junit.jupiter.api.Test;

import static com.lcdlv.ChoiceType.SINGLE;
import static com.lcdlv.ChoiceType.TWIN;
import static org.assertj.core.api.Assertions.assertThat;

class ChoiceTypeTest {


    @Test
    public void choiceIsTwin() {
        assertThat(TWIN.isTwin()).isTrue();
        assertThat(SINGLE.isTwin()).isFalse();
    }
}