package com.kodilla.stream.World;

import java.math.BigDecimal;
import java.util.Set;

public class World {

    private final String name;
    private final Set<Continent> continentSet;

    public World(String name, Set<Continent> continentSet) {
        this.name = name;
        this.continentSet = continentSet;

    }

    public BigDecimal getPeopleQuantity() {

        return continentSet.stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
