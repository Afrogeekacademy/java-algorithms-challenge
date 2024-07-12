package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    @Test
    void testAdditionPositive() {
        assertEquals(10, Addition.addition(7, 3));
    }

    @Test
    void testAdditionNegative() {
        assertEquals(-2, Addition.addition(-1, -1));
    }

    @Test
    void testAdditionNeutral() {
        assertEquals(0, Addition.addition(0, 0));
    }
}
