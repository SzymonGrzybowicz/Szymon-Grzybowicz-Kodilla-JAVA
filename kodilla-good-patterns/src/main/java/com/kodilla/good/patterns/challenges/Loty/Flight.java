package com.kodilla.good.patterns.challenges.Loty;

import java.time.LocalDateTime;

public class Flight {
    private LocalDateTime arriveTime;
    private LocalDateTime departureTime;
    private String destination;
    private String from;
    private int flightID;

    public Flight(LocalDateTime arriveTime, LocalDateTime departureTime, String destination, String from, int flightID) {
        this.arriveTime = arriveTime;
        this.departureTime = departureTime;
        this.destination = destination;
        this.from = from;
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return flightID == flight.flightID;
    }

    @Override
    public int hashCode() {
        return flightID;
    }
}
