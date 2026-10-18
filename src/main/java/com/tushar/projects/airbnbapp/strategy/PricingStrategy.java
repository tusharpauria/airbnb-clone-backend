package com.tushar.projects.airbnbapp.strategy;

import com.tushar.projects.airbnbapp.entity.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);

}
