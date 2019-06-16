package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producer {

    private OrderInformation orderInformation;
    private boolean orderFinished = false;

    public GlutenFreeShop(OrderInformation orderInformation) {
        this.orderInformation = orderInformation;
    }

    @Override
    public void process() {

        System.out.println("Wykonywanie zamówienia dla Gluten Free Shop, zamówienie: " + orderInformation);
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
