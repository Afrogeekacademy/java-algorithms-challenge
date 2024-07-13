package fr.afrogeek.algorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitSumTest {
    @Test
    public void testSumPositiveNumbers() {
        assertEquals(20,DigitSum.sumOfDigits(884));
        assertEquals(15,DigitSum.sumOfDigits(12345));

    }
    @Test
    public void testSumNegativeNumbers() {
        assertEquals(-6,DigitSum.sumOfDigits(-123));
    }
    @Test
    public void testSumNumbersZero() {
        assertEquals(0,DigitSum.sumOfDigits(0));
    }
    @Test
    public void testSumNumbersOne() {
        assertEquals(1,DigitSum.sumOfDigits(1));
    }
    @Test
    public void testSumNumbersOneNegativ() {
        assertEquals(-1,DigitSum.sumOfDigits(-1));
    }
}
