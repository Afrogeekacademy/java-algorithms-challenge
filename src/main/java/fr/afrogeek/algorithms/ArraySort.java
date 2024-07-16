package fr.afrogeek.algorithms;

import java.util.Arrays;

public class ArraySort {
    public static int[] sortArray(int[] numbers){
        Arrays.sort(numbers);

     for(int i:numbers);

        return numbers;
    }

    //hauptmethode um den Code uszuführen
    public static void main(String[] args){

      int[] numbers= {3,9,12,7,-2,2,5,6,0,4};
      System.out.println("die Array ist folgendes sortiert :" + sortArray(numbers));

    }
}
