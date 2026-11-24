package Guia1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un año para saber si es bisiesto: ");
        int anio = entrada.nextInt();

        if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }

        entrada.close();
    }
}
