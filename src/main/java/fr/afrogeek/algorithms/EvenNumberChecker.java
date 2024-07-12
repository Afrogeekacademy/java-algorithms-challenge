package fr.afrogeek.algorithms;
import java.util.Scanner;
// Methode um zu überprüfen, ob ein Zahl gerade oder ungerade ist
public class EvenNumberChecker {
    public static boolean isEven(int n) {

        return n % 2==0;
    }
  // Hauptmethode um das Programm auszuführen
    public static void main(String[] args){
      // Scanner Objekt zur Eingabe von der Konsole erstellen
        Scanner scanner = new Scanner(System.in);

        //benutzer zur eingabe einer Zahl auffordern
        System.out.print("bitte geben sie eine Zahl ein:");
        int n = scanner.nextInt();
        //überprüft, ob die eingegebenen Zahl gerade ist
        if(isEven(n)){
            System.out.println(n + "ist eine gerade zahl");
        } else{
            System.out.println(n + "ist eine ungerade zahl");
        }
        //scanner schließen
        scanner.close();
    }
}
