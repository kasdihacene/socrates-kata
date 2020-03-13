package com.lcdlv.util;

import com.lcdlv.CheckIn;
import com.lcdlv.CheckOut;
import com.lcdlv.ChoiceType;
import com.lcdlv.Participant;

import static com.lcdlv.ChoiceType.NO_ACCOMMODATION;
import static com.lcdlv.util.ParserConstantsUtil.*;

public class ParserUtil {

    public static Participant buildParticipant(String participantCsvLine) {
        String[] ParticipantTokens = participantCsvLine.split(SEPARATOR);

        ChoiceType roomType = getChoiceType(ParticipantTokens);

        String[] arrivalInformation = ParticipantTokens[ARRIVAL_INFO_INDEX].split(SPACE);
        String[] departureInformation = ParticipantTokens[DEPARTURE_INFO_INDEX].split(SPACE);

        return new Participant(ParticipantTokens[NAME_INDEX],
                new CheckIn(arrivalInformation),
                new CheckOut(departureInformation),
                roomType);
    }

    private static ChoiceType getChoiceType(String[] participantTokens) {
        if (uppercaseOf(participantTokens[TYPE_INDEX]).equals(NO_ACCOMMODATION_INPUT)) {
            return NO_ACCOMMODATION;
        } else {
            return ChoiceType.valueOf(uppercaseOf(participantTokens[TYPE_INDEX]));
        }
    }

    private static String uppercaseOf(String participantToken) {
        return participantToken.trim().toUpperCase();
    }

}
