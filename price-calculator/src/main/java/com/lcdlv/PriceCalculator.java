package com.lcdlv;

import com.lcdlv.util.ParserUtil;

import java.time.DayOfWeek;

import static com.lcdlv.ChoiceType.*;

public class PriceCalculator {

    public static int calculateParticipationPrice(String participantInput) {
        Participant participant = ParserUtil.buildParticipant(participantInput);

        if (participantInput.contains(TWIN.getType())) {
            if (participant.getDepartureDay().equals(DayOfWeek.SATURDAY)){
                return TWIN.getPrice() - 40;
            }
            return TWIN.getPrice();
        }else if (participantInput.contains(TRIPLE.getType())){
            if (participantInput.contains(("Friday"))){
                return TRIPLE.getPrice()-40;
            }
            return TRIPLE.getPrice();
        }else if (participantInput.contains(NO_ACCOMMODATION.getType())){
            return NO_ACCOMMODATION.getPrice();
        }else {
            return SINGLE.getPrice();
        }
    }
}
