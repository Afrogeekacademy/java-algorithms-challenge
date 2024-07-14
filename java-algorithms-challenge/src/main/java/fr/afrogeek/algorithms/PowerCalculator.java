package fr.afrogeek.algorithms;

/**
 * Classe permettant le calcul d'un nombre à la puissance n-ieme.
 */
public class PowerCalculator {

    /**
     * calcul de x à la puissance n pour n négatif.
     * @param x Nombre qui va etre calculé à la puissance n.
     * @param n Puissance ou exposant
     * @return x exposant n.
     */
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

    /**
     * calcul de x à la puissance n pour n positif.
     * @param x Nombre qui va etre calculé à la puissance n.
     * @param n Puissance ou exposant
     * @return x exposant n.
     */
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
