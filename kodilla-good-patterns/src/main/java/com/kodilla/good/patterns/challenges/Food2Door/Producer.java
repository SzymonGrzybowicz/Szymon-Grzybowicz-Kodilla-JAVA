package com.kodilla.good.patterns.challenges.Food2Door;

public interface Producer {

    void process();
    OrderInformation getOrderInformation();
    boolean orderFinished();

}
