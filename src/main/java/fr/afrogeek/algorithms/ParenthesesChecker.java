package fr.afrogeek.algorithms;

import java.util.Stack;

public class ParenthesesChecker {

    public static boolean checkBalancedParentheses(String str) { // La methode vérifie si un string a des parentheses ouvrantes et fermantes
        Stack<Character> stack = new Stack<>(); // On utilise pour cela un stackt

        for (char c :  str.toCharArray()) {
            if (c == '(') { // Si on trouvre une parenthese , on ajoute dans le stack
                stack.push(c); // On ajoute au stack
            } else if (c == ')') { // Si on trouve uniquement une parenthese fermente mais pas ouvrante , on vérifie si le stack est vide
                if (stack.isEmpty()) { // On vérifie si le stack est vide
                    return false; // Aucune parenthèse ouvrante pour cette parenthèse fermante
                }
                stack.pop(); // On rétire la parenthese ouvrante .
            }
        }
        return stack.isEmpty(); // L'ajout et le retrait conduit au fait que le stack soit null
    }
}
