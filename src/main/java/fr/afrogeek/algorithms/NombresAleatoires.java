package fr.afrogeek.algorithms;

import java.util.Random;

public class NombresAleatoires {

    public static double nombreRadom(){
        // génération d'un double >= 0.0 et < 1.0
        double d = Math.random();
        System.out.println(d);
        return d; }

    public static int conversion(){
        // La conversion en entier va malheureusement retrancher les chiffres
        // après le point et la valeur obtenue sera 0.
        double d = Math.random();
        int n = (int)d;
        System.out.println(n);
        return n; } // toujours 0

    public static int Entiergenere(){

        // Pour obtenir une valeur entière non nulle, il faut multiplier le
        // nombre aléatoire avec un nombre supérieur 0 avant la conversion.
        // Par exemple, la multiplication par 5 donnera au final un nombre
        // entier égal à 0, 1, 2, 3 ou 4.
        // génération d'un entier >= 0 et < 5

        double d = Math.random();
        int n = (int)d;
        n = (int)(Math.random() * 35);
        System.out.println(n);
        return n;}

    public static double[] ArraysTable(){
    Random rd = new Random(); // creating Random object
    double[] arr = new double[5];


          System.out.println("----------------------------");
         for (int i = 0; i < arr.length; i++) {
             arr[i] = rd.nextInt(); // storing random integers in an array
             System.out.println("|  nombre" + ": |    " + arr[i] + "  |"); // printing each array element
             System.out.println("----------------------------");
         }


    return arr;
    }

    public static void main(String args[]) {

        nombreRadom();
        conversion();
        Entiergenere();
        ArraysTable();

}
}
