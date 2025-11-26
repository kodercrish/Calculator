package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testSubtraction() {
        assertEquals(1, 3 - 2);
    }

    @Test
    void testMultiplication() {
        assertEquals(18, 3*6);
    }

    @Test
    void testDivision() {
        assertEquals(9, 36/4);
    }
}