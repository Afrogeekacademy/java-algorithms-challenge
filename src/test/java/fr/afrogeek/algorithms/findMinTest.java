package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class findMinTest {

    int[] arrayPositiv = {12,21,32,12,321312,32,3,2,4,5};
    int[] arrayNegativ = {-12,-21,-32,-12,-3210,3,2,4,5};
    int[] arrayPositiveAndNegativ = {12,-21,32,-1245,32,-3,2,4,5};
    @Test
    void findMinTestPositivNumber() {
        assertNotEquals(3, FindMin.findMin(arrayPositiv));
        assertEquals(2, FindMin.findMin(arrayPositiv));
    }


    @Test
    void findMinTestNegativeNumber() {
        assertNotEquals(-32, FindMin.findMin(arrayNegativ));
        assertEquals(-3210, FindMin.findMin(arrayNegativ));


    }


    @Test
    void findMinTestPositiveAndNegativeNumber() {
        assertNotEquals(3, FindMin.findMin(arrayPositiveAndNegativ));
        assertEquals(-1245, FindMin.findMin(arrayPositiveAndNegativ));
    }
}
