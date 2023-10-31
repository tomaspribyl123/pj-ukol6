package com.example.mojeMatematickaKnihovna;

public class KvadratickaRovniceVypocty extends KvadratickaRovnice {

    public KvadratickaRovniceVypocty(double a, double b, double c) {
        super(a, b, c);
    }

    public double spocitejFunkci(double x) {
        return getA() * x * x + getB() * x + getC();
    }

    public int pocetKorenu() {
        double diskriminant = getB() * getB() - 4 * getA() * getC();
        if (diskriminant > 0) {
            return 2;
        } else if (diskriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double[] hodnotyKorenu() {
        double diskriminant = getB() * getB() - 4 * getA() * getC();
        if (diskriminant > 0) {
            double koren1 = (-getB() + Math.sqrt(diskriminant)) / (2 * getA());
            double koren2 = (-getB() - Math.sqrt(diskriminant)) / (2 * getA());
            return new double[]{koren1, koren2};
        } else if (diskriminant == 0) {
            double koren = -getB() / (2 * getA());
            return new double[]{koren};
        } else {
            return new double[0];
        }
    }
}
