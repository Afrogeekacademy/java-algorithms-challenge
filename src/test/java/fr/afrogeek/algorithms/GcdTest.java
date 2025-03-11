package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static fr.afrogeek.algorithms.GCDCalculator.gcd;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {

    @Test
    public void deuxEntiersNuls(){
        assertEquals(-1, gcd(0,0));
    }

    @Test
    public void bNulEtaNonNul(){
        assertEquals(5, gcd(5,0));
    }

    @Test
    public void aNulEtbNonNul(){
        assertEquals(10, gcd(0,10));
    }

    @Test
    public void aNegatifbPositif(){
        assertEquals(3, gcd(-3, 18));
    }

    @Test
    public void bNegatifaPositif(){
        assertEquals(6, gcd(30, -18));
    }

    @Test
    public void tousNegatifs(){
        assertEquals(9, gcd(-9, -18));
    }

    @Test
    public void tousPositifs(){
        assertEquals(4, gcd(20, 12));
    }
}
