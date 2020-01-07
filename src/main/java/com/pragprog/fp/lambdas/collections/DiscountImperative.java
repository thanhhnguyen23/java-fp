package com.pragprog.fp.lambdas.collections;

import java.math.BigDecimal;
import java.util.List;

public class DiscountImperative{
    public static void main(String[] args) {

        PricesList pricesList = new PricesList();

        List<BigDecimal> prices = pricesList.retrievePricesList();

        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        totalOfDiscountedPrices = calculateTotalDiscounts(prices, totalOfDiscountedPrices);

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }

    private static BigDecimal calculateTotalDiscounts(List<BigDecimal> prices, BigDecimal totalOfDiscountedPrices) {
        for(BigDecimal price : prices){
            if(price.compareTo(BigDecimal.valueOf(20)) > 0){
                totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }
        return totalOfDiscountedPrices;
    }

}
