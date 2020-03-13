package com.lcdlv;

import static com.lcdlv.ChoiceType.*;

public class PriceCalculator {

    public static int calculateParticipationPrice(String participant) {

        if (participant.contains(TWIN.getType())) {
            return TWIN.getPrice();
        }else if (participant.contains(TRIPLE.getType())){
            if (participant.contains(("Friday"))){
                return TRIPLE.getPrice()-40;
            }
            return TRIPLE.getPrice();
        }else if (participant.contains(NO_ACCOMMODATION.getType())){
            return NO_ACCOMMODATION.getPrice();
        }else {
            return SINGLE.getPrice();
        }
    }
}
