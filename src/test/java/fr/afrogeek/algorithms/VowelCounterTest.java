package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCounterTest {
    //Test le nombre de voyels dans un String vide.
    @Test
     public void VowelCountInLeerString(){
        assertEquals(0, VowelCounter.countVowelsInString(" "));
    }
    //Test le nombre de voyels dans un String quelconque.
    @Test
    public  void VowelCountInString(){
        assertEquals(10, VowelCounter.countVowelsInString("Je suis un apprentis programmeur "));
    }
    //Test le nombre voyels dans un String sans voyels:
    @Test
    public void VowelCountInStringSansVowel(){
        assertEquals(0, VowelCounter.countVowelsInString("kkgjjvjjcjcctvbbbplkm"));
    }

}