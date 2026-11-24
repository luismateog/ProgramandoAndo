package Guia1;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Numeros ingresados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
