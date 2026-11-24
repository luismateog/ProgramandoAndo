package Guia1;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }

        entrada.close();
    }
}
