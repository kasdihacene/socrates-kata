package com.lcdlv.util;

import com.lcdlv.Participant;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserUtilTest {
    @Test
    public void parsingAStringCreatesAParticipantWithCompleteInput() {
        String pierre = "Pierre;Thursday 20h00;Sunday 14h00;Single";
        Participant participant = ParserUtil.buildParticipant(pierre);
        assertThat(participant.toString()).isEqualTo("Pierre;THURSDAY;20:00;SUNDAY;14:00;Single");
    }

    @Test
    public void parsingAStringCreatesAParticipantWithCompleteInputWithNoAccommodation() {
        String pierre = "Pierre;Thursday 20h00;Sunday 14h00;No Accommodation";
        Participant participant = ParserUtil.buildParticipant(pierre);
        assertThat(participant.toString()).isEqualTo("Pierre;THURSDAY;20:00;SUNDAY;14:00;No Accommodation");
    }

}
