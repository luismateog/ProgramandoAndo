package Guia1;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);
        entrada.close();
    }
}
