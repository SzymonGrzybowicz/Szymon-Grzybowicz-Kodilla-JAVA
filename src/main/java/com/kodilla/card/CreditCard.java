package com.kodilla.card;

import java.util.Optional;

public class CreditCard {

    private static final String NUMERIC_RANGE = "[0-9]";

    public String maskify(String number) {
        return Optional.ofNullable(number).map(this::maskNumber).orElse("");
    }

    private String maskNumber(String number) {
        String numberAfterReplace = number.replaceAll(NUMERIC_RANGE, "");
        if (number.length() - numberAfterReplace.length() <= 6) {
            return number;
        }
        String firstChar = number.substring(0,1);
        String lastFourChar = number.substring(number.length() - 4);
        String cutedNumber = number.substring(1, number.length() - 4);
        String replacedNumber = cutedNumber.replaceAll(NUMERIC_RANGE, "#");
        return firstChar + replacedNumber + lastFourChar;
    }
}
