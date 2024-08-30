package fr.afrogeek.algorithms;


import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });

        String expectedMessage = "No valid Parameter";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testFactorial1() {
        assertEquals(1, Factorial.calculateFactorial(0));

    }

    @Test
    public void testFactorial2() {

        assertEquals(120, Factorial.calculateFactorial(5));
    }

}
