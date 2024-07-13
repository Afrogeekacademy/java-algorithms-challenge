package fr.afrogeek.algorithms;

public class DigitSum {
    public static int sumOfDigits(int n){
        if(n == 0) return 0;
        //int sum = 0;
        // String nstr = Integer.toString(n);

        /*for (int i = 0; i < nstr.length() ; i++) {
            int zahl= Integer.parseInt(nstr.substring(i,i+1));// int zahl = Character.getNumericValue(nstr.charAt(i));// converti chaque cractere en entier
            sum += zahl;
        }*/

        int sum = 0;
        //int resultFinalSum=0;
        while(n !=0 ){
            sum += n%10;
            n/= 10;
            if(sum == 0) break;

        }
        return sum;
    }
}
