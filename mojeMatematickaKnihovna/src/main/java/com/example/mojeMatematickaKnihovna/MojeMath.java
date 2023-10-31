package com.example.mojeMatematickaKnihovna;

public class MojeMath {
    public static double prumer(int[] pole) {
        if (pole.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : pole) {
            sum += num;
        }

        return (double) sum / pole.length;
    }

    // Metoda pro výpočet průměru reálných čísel
    public static double prumer(double[] pole) {
        if (pole.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double num : pole) {
            sum += num;
        }

        return sum / pole.length;
    }

    // Metoda pro výpočet rozptylu celých čísel
    public static double rozptyl(int[] pole) {
        if (pole.length == 0) {
            return 0.0;
        }

        double mean = prumer(pole);
        double sumOfSquaredDifferences = 0.0;
        for (int num : pole) {
            double difference = num - mean;
            sumOfSquaredDifferences += difference * difference;
        }

        return sumOfSquaredDifferences / pole.length;
    }

    // Metoda pro výpočet rozptylu reálných čísel
    public static double rozptyl(double[] pole) {
        if (pole.length == 0) {
            return 0.0;
        }

        double prumer = prumer(pole);
        double sumOfSquaredDifferences = 0.0;
        for (double num : pole) {
            double difference = num - prumer;
            sumOfSquaredDifferences += difference * difference;
        }

        return sumOfSquaredDifferences / pole.length;
    }

    // Metoda pro výpočet průměru a rozptylu celých čísel
    public static void prumer_a_rozptyl(int[] pole, double[] result) {
        if (pole.length == 0) {
            result[0] = 0.0;
            result[1] = 0.0;
            return;
        }

        double prumer = prumer(pole);
        result[0] = prumer;

        double sumOfSquaredDifferences = 0.0;
        for (int num : pole) {
            double difference = num - prumer;
            sumOfSquaredDifferences += difference * difference;
        }

        result[1] = sumOfSquaredDifferences / pole.length;
    }

    // Metoda pro výpočet průměru a rozptylu reálných čísel
    public static void prumer_a_rozptyl(double[] pole, double[] result) {
        if (pole.length == 0) {
            result[0] = 0.0;
            result[1] = 0.0;
            return;
        }

        double prumer = prumer(pole);
        result[0] = prumer;

        double sumOfSquaredDifferences = 0.0;
        for (double num : pole) {
            double difference = num - prumer;
            sumOfSquaredDifferences += difference * difference;
        }

        result[1] = sumOfSquaredDifferences / pole.length;
    }
}
