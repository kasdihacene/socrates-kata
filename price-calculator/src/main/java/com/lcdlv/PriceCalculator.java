package com.lcdlv;

public class PriceCalculator {

    public static int calculateParticipationPrice(String participant) {
        if (participant.contains("Twin")) {
            return 510;
        }else if (participant.contains("Triple")){
            return 410;
        }
        return 610;
    }
}
