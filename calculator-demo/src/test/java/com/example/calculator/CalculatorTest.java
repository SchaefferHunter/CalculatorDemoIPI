package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6.0, calc.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(30.0, calc.multiply(5, 6));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, calc.divide(20, 4));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}
