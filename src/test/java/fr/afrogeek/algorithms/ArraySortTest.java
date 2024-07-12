package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

public class ArraySortTest {

    @Test
    public void testWithPostiveAndNegativeNumbers(){
        int[] test1 = {3, 9, 12, 7, -2, 8, 1, 0, 4};
        int[] expected1 = {-2, 0, 1, 3, 4, 7, 8, 9, 12};
        runTest("Test 1",  expected1, ArraySort.sortArray(test1));
    }

    @Test

    public void testWithSortedNumbers(){
        int[] test2={2,3, 4,5,6};
        int[] expected2={2,3,4,5,6};
        runTest("Test2",expected2, ArraySort.sortArray(test2));


    }
    @Test

    public void testWithEqualNumbers(){

        // Test 3: Array with identical numbers
        int[] test3 = {7, 7, 7, 7, 7};
        int[] expected3 = {7, 7, 7, 7, 7};
        runTest("Test 3",  expected3, ArraySort.sortArray(test3));
    }
        private void runTest(String s, int[] test1, int[] expected1) {
    }
}
