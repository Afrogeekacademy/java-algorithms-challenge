package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(numberUtils.isEven(2));
        assertTrue(numberUtils.isEven(0));  // Zero is an even number
        assertTrue(numberUtils.isEven(-4));  // Negative even number
    }
    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(numberUtils.isEven(1));
        assertFalse(numberUtils.isEven(-3));  // negative odd number
        assertFalse(numberUtils.isEven(5));
    }
    @Test
    public void testIsEvenWithLargeNumbers() {
        assertTrue(numberUtils.isEven(1000000));
        assertFalse(numberUtils.isEven(1000001));
    }
}

