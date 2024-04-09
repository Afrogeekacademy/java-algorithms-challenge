package fr.afrogeek;
import java.util.Stack;
import java.util.Random;

/**
 * Générer un Tableu d'entiers aléatoires !
 * <p>
 * Calculer la somme des chiffres d'un nombre
 * <p>
 * Trouver le plus petit élément dans un tableau
 * <p>
 * Inverser un tableau
 */
public class App {
    public static void main(String[] args) {
// Genérer des nombres aléatoires
        Random rand = new Random(); // Créateur de nombre aléatoire

        int[] nombers = new int[5]; // Array de longueur 5
        for (int i = 0; i < nombers.length; i++) {
            nombers[i] = rand.nextInt(100);
        }
        System.out.printf("Nombers aléatoires générés: ");

        for (int i = 0; i < nombers.length; i++) {
            System.out.printf(nombers[i] + " ");
        }
        System.out.println();
        // calculer la somme des chiffres d'un nombre

        int nombre = 2354553;
        int somme = 0;
        for (int i = 0; i < String.valueOf(nombre).length(); i++) {
            char chiffre = String.valueOf(nombre).charAt(i);
            somme = chiffre + somme;

        }
        System.out.printf("nombre: %d \n", nombre);
        System.out.printf("Somme: %d ", somme);
System.out.println();
// Le plus pétit élément d'un tableau

        int petit_element = nombers[0];
        for (int i = 0; i < nombers.length; i++) {
            if (nombers[i] < petit_element) {
                petit_element = nombers[i];
            }
        }
        System.out.printf("Petit element = %d \n", petit_element);

        // Inverser un tableau
        int[] nombers2 = new int[nombers.length];
        for (int i = 0; i < nombers.length; i++) {
            nombers2[i] = nombers[nombers.length - 1 - i];
        }
        System.out.printf("L'inverse :");
        for (int i = 0; i < nombers2.length; i++) {
            System.out.printf(nombers2[i] + " ");
        }

        // Implémenter checkBalancedParentheses et ses tests unitaires en java

        System.out.println(checkBalancedParentheses("(Bal)"));
    }
    public static boolean checkBalancedParentheses(String str) { // La methode vérifie si un string a des parentheses ouvrantes et fermantes
        Stack<Character> stack = new Stack<>(); // On utilise pour cela un stackt

        for (char c : str.toCharArray()) {
            if (c == '(') { // Si on trouvre une parenthese , on ajoute dans le stack
                stack.push(c);
            } else if (c == ')') { // Si on trouve uniquement une parenthese fermente mais pas ouvrante , on vérifie si le stack est vide
                if (stack.isEmpty()) {
                    return false; // Aucune parenthèse ouvrante pour cette parenthèse fermante
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // Vrai si toutes les parenthèses sont appariées
    }
}
