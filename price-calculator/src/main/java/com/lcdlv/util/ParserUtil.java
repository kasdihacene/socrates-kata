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

        return new Participant(ParticipantTokens[NAME_INDEX], new CheckIn(arrivalInformation)
                , new CheckOut(departureInformation), roomType);
    }

    private static ChoiceType getChoiceType(String[] participantTokens) {
        if (participantTokens[TYPE_INDEX].trim().toUpperCase().equals(NO_ACCOMMODATION_INPUT)) {
            return NO_ACCOMMODATION;
        } else {
            return ChoiceType.valueOf(participantTokens[CHOICE_INFO_INDEX].toUpperCase().trim());
        }
    }

//    public static List<CheckIn> parseCsvMeals(String participants) {
//        String[] inputs = participants.split("\n");
//        return Arrays.stream(inputs).map(ParserCheckIn::buildCheckIn).collect(Collectors.toList());
//    }
}
