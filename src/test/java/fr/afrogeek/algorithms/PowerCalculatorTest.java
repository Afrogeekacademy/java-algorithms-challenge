package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PowerCalculatorTest {
    @Test
    void calculatePowerZero(){assertEquals(1, PowerCalculator.calculatePower(5, 0));}

}
