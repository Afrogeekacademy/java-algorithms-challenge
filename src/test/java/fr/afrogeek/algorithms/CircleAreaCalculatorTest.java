package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaCalculatorTest {

    @Test
    void testCircleAreaPositive() {
        assertEquals(314.0, CircleAreaCalculator.CalculateAreaOfCircle(10));
    }

    @Test
    void testCircleAreaNegative() {
        assertEquals(314.0, CircleAreaCalculator.CalculateAreaOfCircle(-10));;
    }

    @Test
    void testCircleAreaNeutral() {
        assertEquals(0.0, CircleAreaCalculator.CalculateAreaOfCircle(0));;
    }

}

