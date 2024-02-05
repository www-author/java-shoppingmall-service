package com.shoppingmall;

import java.math.BigDecimal;

public class LargeAppliance extends Product {
    public LargeAppliance(String name, int price, double weight) {
        super(name, BigDecimal.valueOf(price), weight);
    }
}
