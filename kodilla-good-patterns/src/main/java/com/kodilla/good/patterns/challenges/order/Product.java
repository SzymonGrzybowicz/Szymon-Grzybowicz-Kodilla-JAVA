package com.kodilla.good.patterns.challenges.order;

public interface Product {

    boolean isAvailable();
    void send();
    void setAvailable(boolean available);

}
