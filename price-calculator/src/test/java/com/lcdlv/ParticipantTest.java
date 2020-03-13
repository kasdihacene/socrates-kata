package com.lcdlv;

import org.junit.jupiter.api.Test;

import static com.lcdlv.ChoiceType.SINGLE;
import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantTest {

    @Test
    public void creationOfAParticipantFromAString() {
        Participant participant = new Participant("Pierre", new CheckIn(new String[]{"THURSDAY", "17:00"}),new CheckOut(new String[]{"SUNDAY", "14:00"}), SINGLE);
        assertThat(participant.toString()).isEqualTo("Pierre;THURSDAY;17:00;SUNDAY;14:00;Single");
    }
}
