package fr.afrogeek.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * La classe ArrayMinFinderTest contient des tests unitaires pour la méthode findSmallestElementInArray de la classe ArrayMinFinder.
 */
 public class ArrayMinFinderTest {

    /**
     * Teste la méthode avec un tableau de longueur paire.
     */
    @Test
    public void testFindSmallestElementInArray_evenLength() {
        int[] array = {3, 5, 2, 8, 6, 1};
        int expected = 1;
        assertEquals(expected, ArrayMinFinder.findSmallestElementInArray(array));
    }

    /**
     * Teste la méthode avec un tableau de longueur impaire.
     */
    @Test
    public void testFindSmallestElementInArray_oddLength() {
        int[] array = {7, 4, 6, 3, 9};
        int expected = 3;
        assertEquals(expected, ArrayMinFinder.findSmallestElementInArray(array));
    }

    /**
     * Teste la méthode avec un tableau contenant un seul élément.
     */
    @Test
    public void testFindSmallestElementInArray_singleElement() {
        int[] array = {10};
        int expected = 10;
        assertEquals(expected, ArrayMinFinder.findSmallestElementInArray(array));
    }

    /**
     * Teste la méthode avec un tableau contenant des éléments identiques.
     */
    @Test
    public void testFindSmallestElementInArray_identicalElements() {
        int[] array = {5, 5, 5, 5, 5};
        int expected = 5;
        assertEquals(expected, ArrayMinFinder.findSmallestElementInArray(array));
    }

    /**
     * Teste la méthode avec un tableau contenant des nombres négatifs.
     */
    @Test
    public void testFindSmallestElementInArray_negativeNumbers() {
        int[] array = {-3, -1, -7, -4};
        int expected = -7;
        assertEquals(expected, ArrayMinFinder.findSmallestElementInArray(array));
    }

    /**
     * Teste la méthode avec un tableau contenant des éléments positifs et négatifs.
     */
    @Test
    public void testFindSmallestElementInArray_mixedNumbers() {
        int[] array = {-1, 2, -3, 4, -5};
        int expected = -5;
        assertEquals(expected, ArrayMinFinder.findSmallestElementInArray(array));
    }

    /**
     * Teste la méthode avec un tableau vide.
     */
    @Test
    public void testFindSmallestElementInArray_emptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayMinFinder.findSmallestElementInArray(array);
        });
    }

    /**
     * Teste la méthode avec un tableau null.
     */
    @Test
    public void testFindSmallestElementInArray_nullArray() {
        int[] array = null;
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayMinFinder.findSmallestElementInArray(array);
        });
    }
}
