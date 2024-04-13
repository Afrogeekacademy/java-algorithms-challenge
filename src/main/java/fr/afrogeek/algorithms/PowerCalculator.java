package fr.afrogeek.algorithms;

public class PowerCalculator {

    public static double calculatePower(double x, int n) {
        if (n < 0) {
            if (x == 0) {
                throw new IllegalArgumentException("Undefiniert!!!");
            }
            return 1 / calculatePowerPositive(x, -n);
        } else {
            return calculatePowerPositive(x, n);
        }
    }

    private static double calculatePowerPositive(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = 1;

        for (int i = n; i > 0; i--) {
            result *= x;
        }
        return result;
    }
}
