package com.lcdlv;

public enum ChoiceType {
    SINGLE("Single"),
    TWIN("Twin"),
    TRIPLE("Triple"),
    NO_ACCOMMODATION("No Accommodation");

    protected String type;

    ChoiceType(String type) {
        this.type = type;
    }
}
