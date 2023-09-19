package org.example;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buscador de primos");
        System.out.println("==================");

        while (true) {
            System.out.println("Escriba el número inicial (0 para salir):");
            int inicio = scanner.nextInt();
            if (inicio == 0) {
                break;
            }

            System.out.println("Escriba el número final:");
            int fin = scanner.nextInt();

            int cantidadPrimos = encontrarPrimosEnIntervalo(inicio, fin);
            System.out.println("Se han encontrado " + cantidadPrimos + " números primos en el intervalo.");
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int encontrarPrimosEnIntervalo(int inicio, int fin) {
        int cantidadPrimos = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
                cantidadPrimos++;
            }
        }
        return cantidadPrimos;
    }
}
