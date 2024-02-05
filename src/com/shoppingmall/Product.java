package com.shoppingmall;

import java.math.BigDecimal;

public class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private double weight;

    public Product(
            String name,
            BigDecimal price,
            double weight
    ) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public BigDecimal getDisCountAmount(Product product) {
        if (product instanceof Grocery) {
            return BigDecimal.valueOf(2000);
        } else if (product instanceof Beauty) {
            return BigDecimal.valueOf(10000);
        }
        return BigDecimal.ZERO;
    }
}
