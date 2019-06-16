package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producer {

    private OrderInformation orderInformation;
    private boolean orderFinished = false;

    public HealthyShop(OrderInformation orderInformation) {
        this.orderInformation = orderInformation;
    }

    @Override
    public void process() {

        System.out.println("Wykonywanie zamówienia dla Healthy Shop, zamówienie: " + orderInformation);
        orderFinished = true;
    }

    @Override
    public OrderInformation getOrderInformation() {
        return orderInformation;
    }

    @Override
    public boolean orderFinished() {
        return orderFinished;

    }
}
