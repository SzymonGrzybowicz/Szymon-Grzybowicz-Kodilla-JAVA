package com.kodilla.good.patterns.challenges.order;

public class GameProduct implements Product {

    String name;
    boolean isAvailable;

    public GameProduct(String name) {
        this.name = name;
        this.isAvailable = true;
    }

    @Override
    public void setAvailable(boolean available) {
    this.isAvailable = available;
    }

    @Override
    public void send() {
        System.out.println("Wysyłka tradycyjna, listowa: " + name);
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
}
