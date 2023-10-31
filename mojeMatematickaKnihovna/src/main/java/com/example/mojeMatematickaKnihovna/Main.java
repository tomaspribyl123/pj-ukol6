package com.example.mojeMatematickaKnihovna;

public class Main {
    public static void main(String[] args) {
        KvadratickaRovnice rovnice = new KvadratickaRovnice(2.0, -11.0, 14.0);

        double a = rovnice.getA();
        double b = rovnice.getB();
        double c = rovnice.getC();
        System.out.println("Kvadratická rovnice: " + a + "x^2 + " + b + "x + " + c);

        // Použití třídy KvadratickaRovniceVypocty
        double x = 2.0;
        KvadratickaRovniceVypocty rovniceVypocty = new KvadratickaRovniceVypocty(a, b, c);
        double vysledek = rovniceVypocty.spocitejFunkci(x);
        System.out.println("Hodnota funkce pro x = " + x + " je " + vysledek);

        int pocetKorenu = rovniceVypocty.pocetKorenu();
        System.out.println("Počet kořenů rovnice: " + pocetKorenu);

        double[] koreny = rovniceVypocty.hodnotyKorenu();
        if (koreny.length > 0) {
            System.out.println("Kořeny rovnice jsou: ");
            for (double koren : koreny) {
                System.out.println(koren);
            }
        } else {
            System.out.println("Rovnice nemá reálné kořeny.");
        }

        // Použití třídy MojeMath
        int[] sequenceInt = {1, 2, 3, 4, 5};
        double[] sequenceDouble = {1.0, 2.0, 3.0, 4.0, 5.0};

        double prumerInt = MojeMath.prumer(sequenceInt);
        double rozptylInt = MojeMath.rozptyl(sequenceInt);

        double prumerDouble = MojeMath.prumer(sequenceDouble);
        double rozptylDouble = MojeMath.rozptyl(sequenceDouble);

        System.out.println("Průměr celých čísel: " + prumerInt);
        System.out.println("Rozptyl celých čísel: " + rozptylInt);
        System.out.println("Průměr reálných čísel: " + prumerDouble);
        System.out.println("Rozptyl reálných čísel: " + rozptylDouble);
    }
}
