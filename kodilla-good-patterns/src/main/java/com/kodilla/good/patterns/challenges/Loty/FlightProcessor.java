package com.kodilla.good.patterns.challenges.Loty;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightProcessor {
    private Set<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightFrom(String from) {
        List<Flight> result = flights.stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());

        return result;
    }

    public List<Flight> findFlightByDestination(String destination) {
        List<Flight> result = flights.stream()
                .filter(f -> f.getDestination().equals(destination))
                .collect(Collectors.toList());

        return result;
    }

    public List<Flight> findFlightWithIntermediateStation(String from, String destination, String intermediateStation) {
        List<Flight> result = flights.stream()
                .filter(f -> f.getDestination().equals(destination))
                .filter(f -> f.getFrom().equals(from))
                .filter(f -> f.getIntermediateStation().equals(intermediateStation))
                .collect(Collectors.toList());

        return result;
    }

}
