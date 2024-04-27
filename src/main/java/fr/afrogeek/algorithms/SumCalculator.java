package fr.afrogeek.algorithms;

/*
Tâches à réaliser:

Créer une classe SumCalculator dans le package fr.afrogeek.algorithms.
Implémenter la méthode public static int calculateSum(int N) qui retourne la somme
 des nombres entiers de 1 à N. Si N est inférieur à 1, la méthode doit retourner 0.
Ajouter des tests unitaires dans la classe SumCalculatorTest pour vérifier le bon
fonctionnement de la méthode. Assurez-vous de tester plusieurs cas, y compris N = 0, N = 1, et un N positif quelconque (par exemple, 10 ou 100).
Inclure des tests pour s'assurer que la méthode gère correctement les cas limites, comme un argument négatif, pour confirmer la robustesse de l'implémentation.
 */
public class SumCalculator {

    public static int calculateSum(int N){
        if(N  < 0){
            throw new IllegalArgumentException("N must be greater than 0");
        }
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        return sum;
    }
}
