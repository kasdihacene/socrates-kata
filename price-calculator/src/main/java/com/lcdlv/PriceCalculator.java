package com.lcdlv;

import com.lcdlv.util.ParserUtil;

public class PriceCalculator {

    public static int calculateParticipationPrice(String participantInput) {

        return ParserUtil.buildParticipant(participantInput).process();
    }

}
