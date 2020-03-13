package com.lcdlv.util;

import com.lcdlv.ChoiceType;
import com.lcdlv.Participant;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.ChoiceType.NO_ACCOMMODATION;
import static com.lcdlv.util.ParserConstantsUtil.*;

public class ParserUtil {

    public static Participant buildParticipant(String participantCsvLine) {
        String[] ParticipantTokens = participantCsvLine.split(SEPARATOR);

        ChoiceType roomType = getChoiceType(ParticipantTokens);

        String[] arrivalInformation = ParticipantTokens[ARRIVAL_INFO_INDEX].split(SPACE);
        String[] departureInformation = ParticipantTokens[DEPARTURE_INFO_INDEX].split(SPACE);

        DayOfWeek arrivalDay = DayOfWeek.valueOf(arrivalInformation[0].toUpperCase());
        LocalTime arrivalHour = LocalTime.parse(arrivalInformation[1].toLowerCase().replace(HOUR_CHAR, REPLACEMENT));

        DayOfWeek departureDay = DayOfWeek.valueOf(departureInformation[0].toUpperCase());
        LocalTime departureHour = LocalTime.parse(departureInformation[1].toLowerCase().replace(HOUR_CHAR, REPLACEMENT));

        return new Participant(ParticipantTokens[0], arrivalDay, arrivalHour, departureDay, departureHour, roomType);
    }

    private static ChoiceType getChoiceType(String[] participantTokens) {
        if (participantTokens[3].trim().toUpperCase().equals(NO_ACCOMMODATION_INPUT)) {
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
