package fr.afrogeek;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static double sumArray(double[] arr, int n )
    {
        double sum = 0.0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a int value = ");
        int n = scanner.nextInt();
        System.out.println( "arraysize : " +n );
        double arr[] = new double[n];
        double sum = 0.0;

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter values of Array= ");
            arr[i] = scanner.nextInt();
        }
        sum = sumArray(arr, n);                     //Aufruf der Funktion sumArray
        System.out.println("sumArray = " +sum);
    }
}
