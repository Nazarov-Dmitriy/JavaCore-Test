package ru.neotologia;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {
    Calculator calc = Calculator.instance.get();

    @Test
    public void validateCalcPlus() {
        Integer result = calc.plus.apply(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void validateCalcMinus() {
        Integer result = calc.minus.apply(5, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void validateCalcMultiply() {
        Integer result = calc.multiply.apply(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void validateCalcDevide() {
        Integer result = calc.devide.apply(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void validateCalcDevideByZero() {
        Integer result = calc.devide.apply(6, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void validateCalcPow() {
        Integer result = calc.pow.apply(3);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void validateCalcIsPositive() {
        boolean result = calc.isPositive.test(-5);
        Assertions.assertFalse(result);
    }
}