package com.lcdlv;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.ChoiceType.SINGLE;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantTest {

    @Test
    public void creationOfAParticipantFromAString(){
        Participant participant = new Participant("Pierre", THURSDAY,LocalTime.of(17,0),
                SUNDAY, LocalTime.of(14,0), SINGLE);
        assertThat(participant.toString()).isEqualTo("Pierre;THURSDAY;17:00;SUNDAY;14:00;Single");
    }
}
