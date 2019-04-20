package com.kodilla.stream.World;

import java.math.BigDecimal;

public class Country {

    private final String name;
    private final BigDecimal peopleQuantity;


    public Country(BigDecimal peopleQuantity, String name) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
