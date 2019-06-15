package com.kodilla.good.patterns.challenges.order;

public class ProductOrderService {



    public void  finalizeOrder(Order order){
        order.sell();
        order.makeBill();

        System.out.println("Zamówienie pomyślnie sfinalizowano \n\n");
    }

}
