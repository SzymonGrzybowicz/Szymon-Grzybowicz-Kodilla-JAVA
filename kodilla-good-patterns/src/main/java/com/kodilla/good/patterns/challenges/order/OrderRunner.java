package com.kodilla.good.patterns.challenges.order;

public class OrderRunner {

    public static void main(String[] args) {
        Product productOne = new EBookProduct("Ebook1");
        Product productTwo = new EBookProduct("Ebook2");
        Product productThree = new EBookProduct("Ebook3");
        Product productFour = new EBookProduct("Ebook4");

        Product productFive = new GameProduct("Game1");
        Product productSix = new GameProduct("Game2");
        Product productSeven = new GameProduct("Game3");
        Product productEight = new GameProduct("Game4");

        Order privateOrder = new PrivateOrder("private1");
        Order firmOrder = new FirmOrder("firm1");

        privateOrder.addProduct(productOne);
        privateOrder.addProduct(productEight);
        privateOrder.addProduct(productSix);

        firmOrder.addProduct(productTwo);
        firmOrder.addProduct(productThree);
        firmOrder.addProduct(productFour);
        firmOrder.addProduct(productFive);
        firmOrder.addProduct(productSeven);


        ProductOrderService productOrderService = new ProductOrderService();

        productOrderService.finalizeOrder(privateOrder);
        productOrderService.finalizeOrder(firmOrder);

    }
}
