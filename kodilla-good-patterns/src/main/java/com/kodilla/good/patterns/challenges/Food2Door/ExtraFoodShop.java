package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Producer {

    OrderInformation orderInformation;
    boolean orderFinished = false;

    public ExtraFoodShop(OrderInformation orderInformation) {
        this.orderInformation = orderInformation;
    }

    @Override
    public void process() {

        System.out.println("Wykonywanie zamówienia dla Extra Food Shop, zamówienie: " + orderInformation);
        orderFinished = true;
    }

    @Override
    public OrderInformation getOrderInformation() {
        return orderInformation;
    }

    @Override
    public boolean orderFinished() {
        return  orderFinished;

    }
}
