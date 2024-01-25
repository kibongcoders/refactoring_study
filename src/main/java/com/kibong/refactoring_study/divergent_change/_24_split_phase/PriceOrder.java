package com.kibong.refactoring_study.divergent_change._24_split_phase;

public class PriceOrder {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        ProductData productData = calculateProductData(product, quantity);
        return calculatePrice(productData, shippingMethod);
    }

    private static ProductData calculateProductData(Product product, int quantity) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
                * product.basePrice() * product.discountRate();
        return new ProductData(quantity, basePrice, discount);
    }

    private static double calculatePrice(ProductData productData, ShippingMethod shippingMethod) {
        final double shippingPerCase = (productData.basePrice() > shippingMethod.discountThreshold()) ?
                shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = productData.quantity() * shippingPerCase;
        return productData.basePrice() - productData.discount() + shippingCost;
    }
}
