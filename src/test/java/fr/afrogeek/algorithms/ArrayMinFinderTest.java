package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMinFinderTest {

    @Test
    public void testFindMinWithPositiveNumbers() {
        int[] array = {3, 8, 7, 4, 2, 5};
        assertEquals(2, ArrayMinFinder.findSmallestElementInArray(array));

    }

    @Test
    public void testFindMinWithNegativeNumbers() {
        int[] array = {-3, -7, -5, -8, -6, -2};
        assertEquals(-8, ArrayMinFinder.findSmallestElementInArray(array));
    }

    @Test
    public void testFindMinWithMixedNumbers() {
        int[] array = {2, -1, 8, -4, -9, 1};
        assertEquals(-9, ArrayMinFinder.findSmallestElementInArray(array));
    }
}
