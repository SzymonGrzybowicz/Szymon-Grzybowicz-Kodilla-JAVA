package com.kodilla.good.patterns.challenges.Loty;

public class FlightWithIntermediate {

    private Flight firstFlight;
    private Flight secondFlight;

    public FlightWithIntermediate(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }
}
