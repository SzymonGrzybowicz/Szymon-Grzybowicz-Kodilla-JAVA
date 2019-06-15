package com.kodilla.good.patterns.challenges.order;

import java.util.ArrayList;

public class FirmOrder implements Order {
    private ArrayList<Product> products = new ArrayList<>();
    private String buyerName;

    public FirmOrder(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public void addProduct(Product product) {
        if (product.isAvailable()) {
            products.add(product);
        } else {
            System.out.println("produkt niedostepny");
        }

    }

    @Override
    public void sell() {
        for(Product product : products){
            product.send();
            product.setAvailable(false);
        }

    }


    @Override
    public void makeBill() {
        System.out.println("Wystawiono fakture na firme");

    }
}
