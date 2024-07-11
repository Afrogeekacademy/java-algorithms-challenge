package fr.afrogeek.algorithms;


public class GCDCalculator {

    public static int gcd(int a, int b){

        //Dans notre méthode, nous allons utiliser l'algorithme des différences (ou des soustractions successives
        int gcd = 1;
        int tmp = 0;
        //Opération qui nous permettra de gérer le cas où a ou b est négatif

        a = Math.abs(a); // a devient automatiquement positif
        b = Math.abs(b); // b devient automatiquement positif

        //"gcd(a,b) = gcd(-a,b) = gcd(a,-b) = gcd(-a,-b)", donc nous n'avons rien changer au  résultat final

        //CAS PARTICULIERS

        if(a == 0 || b == 0){
            if(b != 0){
                return b;
            }
            else if(a != 0){
                return a;
            }
            else{
               return -1;
            }
        }

        //CAS GENERAL

        do{
            tmp = Math.abs(a - b);
            if(tmp == 0){
                gcd = a;
            }
            else{
                a = Math.max(b, tmp);
                b = Math.min(b, tmp);
            }
        }while(tmp != 0);


        return gcd;
    }
}
