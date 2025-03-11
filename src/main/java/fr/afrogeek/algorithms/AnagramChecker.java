package fr.afrogeek.algorithms;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean checkAnagram(String s1, String s2) {
        // On supprime les espaces et on met tout en miniscule avant d'effectuer les comparaison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Si les longueurs sont différentes ce n'est pas un anagramme
        if (s1.length() != s2.length()) {
            return false;
        }else {
            // On convertit chaque chaine de caracteres en tableau de caractere, on trie et on compare
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            return Arrays.equals(chars1, chars2);
        }
    }
}
