package com.pragprog.fp.lambdas.collections;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class PricesList {

    public List<BigDecimal> retrievePricesList() {
        return Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));
    }
}
