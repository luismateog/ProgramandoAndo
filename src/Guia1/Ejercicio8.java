package Guia1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: $");
        double compra = entrada.nextDouble();

        if (compra < 0) {
            System.out.println("El valor de la compra no puede ser negativo.");
        } else {
            double porcentajeDescuento = 0;

            if (compra > 500000) {
                porcentajeDescuento = 0.20;
            } else if (compra > 200000) {
                porcentajeDescuento = 0.15;
            } else if (compra > 100000) {
                porcentajeDescuento = 0.10;
            }

            double descuento = compra * porcentajeDescuento;
            double total = compra - descuento;

            System.out.printf("Valor original: $%.2f%n", compra);
            System.out.printf("Descuento: $%.2f%n", descuento);
            System.out.printf("Total a pagar: $%.2f%n", total);
        }

        entrada.close();
    }
}
