package fr.afrogeek.algorithms;

public class ArrayMinFinder {
    public static int findSmallestElementInArray(int[] array){

        //initialiseren der Variablen min , um das kleinste Element zu finden

        int min = array[0];

        //durchlaufen des arrays, um das kleinste Element zu finden

        for(int i=1; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    // Hauptmethode, um das Programm auszuführen
    public static void main(String[] args){
       // beispieleeingaben
        int[] numbers = {3,5,7,2,8,-1,4};

        //aufrufen der findSmallestElementInArray-methode und ausgabe des Ergebnisses
        System.out.println("das kleinste element im Array ist: " + findSmallestElementInArray(numbers));
    }
}



