package com.lcdlv;

public enum ChoiceType {
    SINGLE("Single", 610),
    TWIN("Twin", 510),
    TRIPLE("Triple", 410),
    NO_ACCOMMODATION("No Accommodation", 240);

    private int price;
    private String type;

    ChoiceType(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean isTwin() {
        return this.equals(TWIN);
    }

    public boolean isTriple() {
        return this.equals(TRIPLE);
    }

    public boolean isNoAccommodation() {
        return this.equals(NO_ACCOMMODATION);
    }
}
