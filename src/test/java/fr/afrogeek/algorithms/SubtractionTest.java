package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {
    @Test
    void testSubtractionPositive() {
        assertEquals(4, Subtraction.subtraction(7, 3));
    }

    @Test
    void testSubtractionNegative() {
        assertEquals(0, Subtraction.subtraction(-1, -1));
    }

    @Test
    void testSubtractionNeutral() {
        assertEquals(10, Subtraction.subtraction(10, 0));
    }
}
