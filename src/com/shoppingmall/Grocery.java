package com.shoppingmall;

import java.math.BigDecimal;

public class Grocery extends Product {
    public Grocery(String name, int price, double weight) {
        super(name, BigDecimal.valueOf(price), weight);
    }
}
