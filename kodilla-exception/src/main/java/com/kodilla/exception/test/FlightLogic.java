package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightLogic {

    private HashMap<String, Boolean> map;

    public FlightLogic(HashMap<String, Boolean> map) {
        this.map = map;
    }

    public void findFilght(Flight flight) throws RouteNotFoundException {
        if (map.containsKey(flight.getArrivalAirport())) {

            if (map.get(flight.getArrivalAirport())) {
                System.out.println("Permission to landing on: " + flight.getArrivalAirport());
            } else {
                System.out.println("There is no permission to landing on: " + flight.getArrivalAirport());
            }

        } else {

            throw new RouteNotFoundException();

        }

    }
}
