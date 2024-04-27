package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxOfTwoTest {

    @Test
    public void testPositiveNumbers() {
        assertEquals(5, MaxOfTwo.maxOfTwoNumbers(3, 5));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-2, MaxOfTwo.maxOfTwoNumbers(-5, -2));
    }

    @Test
    public void testMixedNumbers() {
        assertEquals(4, MaxOfTwo.maxOfTwoNumbers(-2, 4));
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(10, MaxOfTwo.maxOfTwoNumbers(10, 10));
    }

}
