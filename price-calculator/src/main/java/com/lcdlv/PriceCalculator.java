package com.lcdlv;

import static com.lcdlv.ChoiceType.*;

public class PriceCalculator {

    public static int calculateParticipationPrice(String participant) {
        if (participant.contains(TWIN.type)) {
            return 510;
        }else if (participant.contains(TRIPLE.type)){
            return 410;
        }else if (participant.contains(NO_ACCOMMODATION.type)){
            return 240;
        }
        return 610;
    }
}
