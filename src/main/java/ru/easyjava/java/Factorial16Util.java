package ru.easyjava.java;


import lombok.Getter;

import java.math.BigDecimal;

public class Factorial16Util {
    @Getter(lazy = true)
    private final BigDecimal factorial16 = factorial(new BigDecimal(16));

    private BigDecimal factorial(BigDecimal current) {
        if (current.equals(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        }
        return current.multiply(factorial(current.subtract(BigDecimal.ONE)));
    }
}
