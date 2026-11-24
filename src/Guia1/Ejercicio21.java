package Guia1;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero no negativo: ");
        int numero = entrada.nextInt();

        if (numero < 0 || numero > 20) {
            System.out.println("Ingrese un numero entre 0 y 20 para evitar desbordamiento.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        entrada.close();
    }
}
