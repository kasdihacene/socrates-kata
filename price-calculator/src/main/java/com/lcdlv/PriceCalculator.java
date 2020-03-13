package com.lcdlv;

import com.lcdlv.util.ParserUtil;

public class PriceCalculator {

    public static int calculateParticipationPrice(String participantInput) {
        Participant participant = ParserUtil.buildParticipant(participantInput);

        return participant.process();
    }

}
