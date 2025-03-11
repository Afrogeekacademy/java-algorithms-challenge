package fr.afrogeek.algorithms;

import java.util.Random;

public class NombresAleatoires {

    public static double nombreRadom(){
        // génération d'un double >= 0.0 et < 1.0
        double d = Math.random();
        return d;
    }

    public static int conversion(){
        // La conversion en entier va malheureusement retrancher les chiffres
        // après le point et la valeur obtenue sera 0.
        double d = Math.random();
        int n = (int)d;
        return n;
    }

    public static int Entiergenere(){

        // Pour obtenir une valeur entière non nulle, il faut multiplier le
        // nombre aléatoire avec un nombre supérieur 0 avant la conversion.
        // Par exemple, la multiplication par 5 donnera au final un nombre
        // entier égal à 0, 1, 2, 3 ou 4.
        // génération d'un entier >= 0 et < 5

        double d = Math.random();
        int n = (int)d;
        n = (int)(Math.random() * 35);
        return n;
    }

    public static int[] ArraysTable(){
        Random rd = new Random(); // creating Random object
        int[] arr = new int[5];
        return arr;
    }
}
