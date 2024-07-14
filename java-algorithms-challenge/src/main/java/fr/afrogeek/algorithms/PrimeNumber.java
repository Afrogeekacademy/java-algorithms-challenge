package fr.afrogeek.algorithms;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {  //verifie les nombres negative, le nbre doit appartenir au nombre entier naturel positive
            return false;
        }
        int carree_number = (int) Math.sqrt(n); // la variable carree_number recoit la racine carree de n
        for (int i = 2; i <= carree_number; i++) {
            if (n % i == 0) {
                return false;  // A touver un diviseur autre que 1
            }
        }
        return true; // si le nombre a verifie les conditions et le nombre est premier
    }
        /*i wanted just try to make a output with sout
         public static void main(String[] arg){
            int n=1;
            if(isPrime(n)){
               System.out.println(n + "" + "est un nombre premier.");
             } else{
               System.out.println(n + "" + "n'est pas un nombre premier.");
               }
            }
         */
}
