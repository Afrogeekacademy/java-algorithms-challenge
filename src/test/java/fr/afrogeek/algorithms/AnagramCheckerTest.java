package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {
    @Test
    void testAnagramChecker1() {
        assertTrue(AnagramChecker.checkAnagram("ngono", "nongo"));
    }

    @Test
    void testAnagramChecker2(){
        assertFalse(AnagramChecker.checkAnagram("Kwette", "Kuette"));
    }
}
