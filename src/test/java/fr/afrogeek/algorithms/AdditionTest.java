package fr.afrogeek.algorithms;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    @Test
    public void testAdditionPositive() {
        assertEquals(10, Addition.addition(7, 3));
    }

    @Test
    public void testAdditionNegative() {
        assertEquals(-2, Addition.addition(-1, -1));
    }

    @Test
    public void testAdditionNeutral() {
        assertEquals(0, Addition.addition(0, 0));
    }
}
