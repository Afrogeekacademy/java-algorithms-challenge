package fr.afrogeek.algorithms;

public class Factorial {
    public static int calculateFactorial(int n){
        if(n<0) throw new IllegalArgumentException("No valid Parameter");
        if(n == 0){
            return 1;
        }
        return n * calculateFactorial(n-1);
    }
}
