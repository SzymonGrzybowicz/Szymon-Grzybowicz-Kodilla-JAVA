package com.kodilla.good.patterns.challenges.order;

public class EBookProduct implements Product {


    String name;
    boolean isAvailable;


    public EBookProduct(String name) {
        this.name = name;
        this.isAvailable = true;
    }

    @Override
    public void send() {
        System.out.println("Wysyłka przez internet: " + name);
    }


    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available){
        this.isAvailable = available;
    }
}
