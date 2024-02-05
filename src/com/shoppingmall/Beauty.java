package com.shoppingmall;

import java.math.BigDecimal;

public class Beauty extends Product {
    public Beauty(String name, int price, double weight) {
        super(name, BigDecimal.valueOf(price), weight);
    }
}
