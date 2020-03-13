package com.lcdlv.util;

import com.lcdlv.ChoiceType;
import com.lcdlv.Participant;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static com.lcdlv.ChoiceType.NO_ACCOMMODATION;

public class ParserUtil {

    public static Participant buildParticipant(String participantCSV) {
        String[] token = participantCSV.split(";");
        String arrivalDayAndHour = token[1];
        String departureDayAndHour = token[2];

        ChoiceType roomType;
        if (token[3].trim().toUpperCase().equals("NO ACCOMMODATION")) roomType = NO_ACCOMMODATION;
        else roomType = ChoiceType.valueOf(token[3].toUpperCase().trim());

        String[] arrivalInformation = arrivalDayAndHour.split(" ");
        String[] departureInformation = departureDayAndHour.split(" ");

        DayOfWeek arrivalDay = DayOfWeek.valueOf(arrivalInformation[0].toUpperCase());
        LocalTime arrivalHour = LocalTime.parse(arrivalInformation[1].toLowerCase().replace("h", ":"));

        DayOfWeek departureDay = DayOfWeek.valueOf(departureInformation[0].toUpperCase());
        LocalTime departureHour = LocalTime.parse(departureInformation[1].toLowerCase().replace("h", ":"));

        return new Participant(token[0], arrivalDay, arrivalHour, departureDay, departureHour,roomType );
    }

//    public static List<CheckIn> parseCsvMeals(String participants) {
//        String[] inputs = participants.split("\n");
//        return Arrays.stream(inputs).map(ParserCheckIn::buildCheckIn).collect(Collectors.toList());
//    }
}
