package fr.afrogeek.algorithms;


public class ArrayMinFinder {
    public static int findSmallestElementInArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être null ou vide");
        }

        int smallest = array[0]; // Initialiser avec le premier élément du tableau
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; // Mettre à jour le plus petit élément
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 8, 6, 1};
        System.out.println("Le plus petit élément est : " + findSmallestElementInArray(array));

    }

}