package Guia1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double primero = entrada.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double segundo = entrada.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double tercero = entrada.nextDouble();

        double mayor = primero;
        if (segundo > mayor) {
            mayor = segundo;
        }
        if (tercero > mayor) {
            mayor = tercero;
        }

        int cantidadMayores = 0;
        if (primero == mayor) {
            cantidadMayores++;
        }
        if (segundo == mayor) {
            cantidadMayores++;
        }
        if (tercero == mayor) {
            cantidadMayores++;
        }

        System.out.println("El mayor es: " + mayor);
        if (cantidadMayores == 2) {
            System.out.println("Hay un empate entre dos numeros.");
        } else if (cantidadMayores == 3) {
            System.out.println("Hay un empate entre los tres numeros.");
        }

        entrada.close();
    }
}
