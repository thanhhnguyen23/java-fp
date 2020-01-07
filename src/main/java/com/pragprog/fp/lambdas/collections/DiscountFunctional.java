package com.pragprog.fp.lambdas.collections;

import java.math.BigDecimal;
import java.util.List;

public class DiscountFunctional {

    public static void main(String[] args) {
        PricesList pricesList = new PricesList();

        List<BigDecimal> prices = pricesList.retrievePricesList();

        BigDecimal totalOfDiscountedPrices =
                prices.stream()
                    .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                    .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }

}
