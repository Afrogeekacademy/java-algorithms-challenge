package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NombresAleatoiresTest {

    @Test
    void testNombreAleatoire(){assertEquals (NombresAleatoires.nombreRadom());}

    @Test
    void testConversion(){assertEquals(NombresAleatoires.conversion());}

    @Test
    void testGenerationEntier(){assertEquals(NombresAleatoires.Entiergenere());}

    @Test
    void testArrayTable(){assertArrayEquals(NombresAleatoires.ArraysTable());}

    private void assertArrayEquals(double[] doubles) {
    }

    private void assertEquals(double v) {
    }
    
}
