package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DigitSumCalculatorTest {

        @Test
        void testDigitSumPositive() {
            assertEquals(8,DigitSumCalculator.calculateSumOfDigits(233));
        }

        @Test
        void testDigitSumNegative() {
            assertEquals(-6,DigitSumCalculator.calculateSumOfDigits(-123));
        }

        @Test
        void testDigitSumNeutral() {
            assertEquals(0, DigitSumCalculator.calculateSumOfDigits(0));
        }
}
