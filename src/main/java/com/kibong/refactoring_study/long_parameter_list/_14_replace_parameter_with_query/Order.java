package com.kibong.refactoring_study.long_parameter_list._14_replace_parameter_with_query;

public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        //

        double basePrice = this.quantity * this.itemPrice;
        int discountLevel = getDiscountLevel();
        return this.discountedPrice(basePrice);
    }

    private int getDiscountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice) {
        return getDiscountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
