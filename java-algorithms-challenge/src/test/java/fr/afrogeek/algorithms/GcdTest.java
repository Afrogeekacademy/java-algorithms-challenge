package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static fr.afrogeek.algorithms.GCDCalculator.gcd;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {

    @Test
    public void deuxEntiersNuls(){
        assertEquals(-1, gcd(0,0));
        System.out.println("Oups, impossible de trouver le gcd de deux nombres nuls car le gcd est un nombre entier naturel. La valeur de retour sera par défaut de -1 \ngcd(0, 0) = " + gcd(0,0));
    }

    @Test
    public void bNulEtaNonNul(){
        assertEquals(5, gcd(5,0));
        System.out.println("gcd(5, 0) = " + gcd(5, 0));
    }

    @Test
    public void aNulEtbNonNul(){
        assertEquals(10, gcd(0,10));
        System.out.println("gcd(0, 10) = " + gcd(0, 10));
    }

    @Test
    public void aNegatifbPositif(){
        assertEquals(3, gcd(-3, 18));
        System.out.println("gcd(-3, 18) = " + gcd(-3, 18));
    }

    @Test
    public void bNegatifaPositif(){
        assertEquals(6, gcd(30, -18));
        System.out.println("gcd(30, -18) = " + gcd(30, -18));
    }

    @Test
    public void tousNegatifs(){
        assertEquals(9, gcd(-9, -18));
        System.out.println("gcd(-9, -18) = " + gcd(-9, -18));
    }

    @Test
    public void tousPositifs(){
        assertEquals(4, gcd(20, 12));
        System.out.println("gcd(20, 12) = " + gcd(20, 12));
    }
}
