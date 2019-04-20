package com.kodilla.stream.World;

import java.util.Set;

public class Continent {

    private final String name;
    private final Set<Country> countrySet;

    public Continent(String name, Set<Country> countrySet) {
        this.name = name;
        this.countrySet = countrySet;
    }

    public Set<Country> getCountrySet() {
        return countrySet;
    }
}
