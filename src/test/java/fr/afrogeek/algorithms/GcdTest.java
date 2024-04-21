package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static fr.afrogeek.algorithms.GCDCalculator.gcd;

public class GcdTest {

    @Test
    public void deuxEntiersNuls(){
        System.out.println("gcd(0, 0) = " + gcd(0,0));
    }

    @Test
    public void bNulEtaNonNul(){
        System.out.println("gcd(5, 0) = " + gcd(5, 0));
    }

    @Test
    public void aNulEtbNonNul(){
        System.out.println("gcd(0, 10) = " + gcd(0, 10));
    }

    @Test
    public void aNegatifbPositif(){
        System.out.println("gcd(-3, 18) = " + gcd(-3, 18));
    }

    @Test
    public void bNegatifaPositif(){
        System.out.println("gcd(30, -18) = " + gcd(30, -18));
    }

    @Test
    public void tousNegatifs(){
        System.out.println("gcd(-9, -18) = " + gcd(-9, -18));
    }

    @Test
    public void tousPositifs(){
        System.out.println("gcd(20, 12) = " + gcd(20, 12));
    }
}
