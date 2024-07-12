package fr.afrogeek.algorithms;
public class VowelCounter {
    //La methode prends un String et compte le nombre de voyels dna la String.
    public static int countVowelsInString(String s){
        //String s;
        s= s.toLowerCase();
        int vowelNumber= 0;
        for (int i=0; i<s.length(); i++) {
            char Chars = s.charAt(i);

            switch (Chars){
                case 'a': case 'e': case 'i': case 'O': case 'u':
                    vowelNumber++;
                    System.out.println(vowelNumber);
               // break;

                default:
                    System.out.print(Chars);


            }

        }
        return vowelNumber;
    }
}