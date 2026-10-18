package com.tushar.projects.airbnbapp.strategy;

import com.tushar.projects.airbnbapp.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy {

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {

        return inventory.getRoom().getBasePrice();

    }
}
