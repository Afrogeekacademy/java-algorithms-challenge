package fr.afrogeek.algorithms;

public class Factorial {

    public static long factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("n must be positive");
        }
        long result = 1;
        for(int i=1; i<=n; i++){
            result = result * i;
        }
        return result;
    }

}
