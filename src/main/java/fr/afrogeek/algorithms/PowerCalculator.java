package fr.afrogeek.algorithms;

import java.lang.Math;
public class PowerCalculator {

    public static double calculatePower(double x, int n) {
        if (x == 0) {
            if (n < 0) {
                throw new IllegalArgumentException("Unendlich!!!");
            } else if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return Math.pow(x, n);
        }
    }
}

