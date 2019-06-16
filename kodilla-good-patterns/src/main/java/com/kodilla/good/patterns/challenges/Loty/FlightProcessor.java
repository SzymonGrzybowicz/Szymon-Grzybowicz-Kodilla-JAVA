package com.kodilla.good.patterns.challenges.Loty;

import java.util.ArrayList;
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

    public List<FlightWithIntermediate> findFlightWithIntermediateStation(String from, String destination, String intermediateStation) {

        List result = new ArrayList();


        List<Flight> flightsToDestination = flights.stream()
                .filter(f -> f.getDestination().equals(destination))
                .collect(Collectors.toList());


        for (Flight flightToDestination : flightsToDestination) {
            for (Flight firstFlight : flights) {
                if (firstFlight.getDestination().equals(flightToDestination.getFrom())) {
                    result.add(new FlightWithIntermediate(firstFlight, flightToDestination));

                }
            }
        }

        return result;
    }

}
