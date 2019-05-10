package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightRunner {

    public static void main(String[] args) {


        HashMap<String, Boolean> map = new HashMap<>();


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                map.put("Airport" + i, true);
            } else {
                map.put("Airport" + i, true);
            }
        }

        FlightLogic flightLogic = new FlightLogic(map);

        try {
            flightLogic.findFilght(new Flight("Airport99", "Airport1"));
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport");
        } finally {
            System.out.println("System OK!");
        }

        try {
            flightLogic.findFilght(new Flight("Airport99", "Airport4"));
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport");
        } finally {
            System.out.println("System OK!");
        }

        try {
            flightLogic.findFilght(new Flight("Airport99", "Airport15"));
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport");
        } finally {
            System.out.println("System OK!");
        }

    }

}
