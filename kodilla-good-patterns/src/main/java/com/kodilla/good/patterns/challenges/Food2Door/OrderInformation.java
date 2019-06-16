package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderInformation {

    private String supplierName;
    private int quantity;
    private String productType;

    public OrderInformation(String supplierName, int quantity, String productType) {
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "OrderInformation{" +
                "supplierName='" + supplierName + '\'' +
                ", quantity=" + quantity +
                ", productType='" + productType + '\'' +
                '}';
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return productType;
    }
}
