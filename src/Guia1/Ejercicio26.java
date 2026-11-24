package Guia1;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el valor que desea buscar: ");
        int valor = entrada.nextInt();

        int ocurrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                ocurrencias++;
            }
        }

        System.out.println("El valor aparece " + ocurrencias + " veces.");
        entrada.close();
    }
}
