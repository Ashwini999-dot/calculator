package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(7, Calculator.add(7, 0), "7 + 0 should equal 7");
    }
}
