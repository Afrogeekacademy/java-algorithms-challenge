package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaxOfTwoTest {
	


	    @Test
	    public void positiveTest() {
	        assertEquals(3, MaxOfTwo.maxOfTwoNumbers(2, 3));
	    }

	    @Test
	    public void equalTest() {
	        assertEquals(2, MaxOfTwo.maxOfTwoNumbers(2, 2));
	    }

	    @Test
	    public void NegativeTest() {
	        assertEquals(-2, MaxOfTwo.maxOfTwoNumbers(-2, -3));
	    }

	    @Test
	    public void PositiveAndNegativeTest() {
	        assertEquals(3, MaxOfTwo.maxOfTwoNumbers(-2, 3));
	    }

}
