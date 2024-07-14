package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSummeTest {
    @Test
    void testDigitSumPositive() {
        assertEquals(8,DigitSumme.calculateSumOfDigits(233));
    }

    @Test
    void testDigitSumNegative() {
        assertEquals(-6,DigitSumme.calculateSumOfDigits(-123));
    }

    @Test
    void testDigitSumNeutral() {
        assertEquals(0, DigitSumme.calculateSumOfDigits(0));
    }

}
