package com.shoppingmall;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public BigDecimal calculateDeliveryCharge() {
        BigDecimal totalDeliveryCharge = BigDecimal.ZERO;
        for (Product product : products) {
            BigDecimal weightUnitDeliveryCharge = getWeightUnitDeliveryCharge(product.getWeight());
            BigDecimal discountedDeliveryFee = getDiscountBillingByPrice(weightUnitDeliveryCharge, product.getPrice());
            totalDeliveryCharge = totalDeliveryCharge.add(discountedDeliveryFee);
        }
        return totalDeliveryCharge;
    }

    public BigDecimal getWeightUnitDeliveryCharge(double weight) {
        if (weight < 3.0) {
            return BigDecimal.valueOf(1000);
        } else if (weight < 10.0) {
            return BigDecimal.valueOf(5000);
        }
        return BigDecimal.valueOf(10000);
    }
    public BigDecimal getDiscountBillingByPrice(BigDecimal weightUnitDeliveryCharge, BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(30000)) < 0) {
            return weightUnitDeliveryCharge;
        } else if (price.compareTo(BigDecimal.valueOf(100000)) < 0) {
            return weightUnitDeliveryCharge.subtract(BigDecimal.valueOf(1000));
        }
        return BigDecimal.ZERO;
    }

}
