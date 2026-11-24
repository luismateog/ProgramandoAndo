package Guia1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad < 0) {
            System.out.println("Edad inválida");
        } else if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("Acceso denegado");
        }

        entrada.close();
    }
}
