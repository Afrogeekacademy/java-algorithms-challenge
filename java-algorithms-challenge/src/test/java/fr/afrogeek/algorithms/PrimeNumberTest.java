package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;
/*import static org.junit.jupiter.api.Assertions.assertEquals;*/

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {
    @Test    // Permet de definir une methode de test
    public void PrimeNumberConnu (){                  /*Dans cette methode, nous utilisons la methode  assertTrue pour verifier que les nombres premiers
                                                        connus mentionne sont vrai lorsqu'ils sont dans la methode isPrime() */
        /* assertEquals(PrimeNumber.isPrime(2));*/

        assertTrue(PrimeNumber.isPrime(2));
        assertTrue(PrimeNumber.isPrime(3));
        assertTrue(PrimeNumber.isPrime(5));
        assertTrue(PrimeNumber.isPrime(7));
        assertTrue(PrimeNumber.isPrime(11));
    }
    @Test   //Permet de signaler que notre methode est une methode de test
    public void NonPrimeNumber(){
      /*Dans cette methode, nous utilisons la methode  assertFalse pour verifier que les nombres non premiers
       connus mentionne a gauche retourne false lorsqu'ils sont passes a la methode isPrime() */
        
        assertFalse(PrimeNumber.isPrime(0));
        assertFalse(PrimeNumber.isPrime(1));
        assertFalse(PrimeNumber.isPrime(4));
        assertFalse(PrimeNumber.isPrime(6));
        assertFalse(PrimeNumber.isPrime(8));
        assertFalse(PrimeNumber.isPrime(9));
        assertFalse(PrimeNumber.isPrime(10));
        assertFalse(PrimeNumber.isPrime(-1));
    }

}

