package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumberCheckerTest {

    @Test
    public void testEvenNumber(){
        assertTrue(EvenNumberChecker.isEven(6));
    }



    @Test
    public void testOddNumber(){
        assertFalse(EvenNumberChecker.isEven(5));

    }
    @Test
    public void testNegativeEvenNumber(){
        assertTrue(EvenNumberChecker.isEven(-8));
    }
    @Test
    public void testNegativeOddNumber(){
        assertFalse(EvenNumberChecker.isEven(-9));
    }
    @Test
    public void testZero(){
        assertTrue(EvenNumberChecker.isEven(0));
    }
}

