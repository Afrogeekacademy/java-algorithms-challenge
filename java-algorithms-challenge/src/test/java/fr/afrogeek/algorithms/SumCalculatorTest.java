package fr.afrogeek.algorithms;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static fr.afrogeek.algorithms.SumCalculator.calculateSum;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    @Test
    public void testSumPositif()
    {
        assertEquals(15, calculateSum(5));
    }

    @Test
    public void calculateSumShouldReturnTheSumOfTwoNumber(){
        assertNotEquals(4,calculateSum(3));
    }

    @Test
    void testcalculateSumNegatif(){
        Exception exception = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                calculateSum(-1);
            }
        });
        assertNotNull(exception);
        assertEquals("N must be greater than 0", exception.getMessage());
    }

    @Test
    public void testcalculateSumWithZero(){
        assertEquals(0, SumCalculator.calculateSum(0));
    }
}
