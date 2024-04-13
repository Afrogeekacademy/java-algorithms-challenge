package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class PowerCalculatorTest {

    @Test
    void calculatePowerZero(){assertEquals(1, PowerCalculator.calculatePower(5, 0));}

    @Test
    void calculateZeroPower(){assertEquals(0, PowerCalculator.calculatePower(0, 3));}

    @Test
    void calculatePowerOfZeroNegative(){assertThrows(IllegalArgumentException.class, () -> {PowerCalculator.calculatePower(0, -2);});
    }

    @Test
    void calculatePowerNegative(){assertEquals(9, PowerCalculator.calculatePower(-3, 2));}

    @Test
    void calculateNegativePower(){assertEquals(0.25, PowerCalculator.calculatePower(2, -2));}

    @Test
    void calculateNegativePowerNegative(){assertEquals(0.0625, PowerCalculator.calculatePower(-4, -2));}
}
