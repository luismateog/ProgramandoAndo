package Guia1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double primero = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double segundo = entrada.nextDouble();
        System.out.print("Ingrese un operador (+, -, *, /): ");
        char operador = entrada.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (primero + segundo));
                break;
            case '-':
                System.out.println("Resultado: " + (primero - segundo));
                break;
            case '*':
                System.out.println("Resultado: " + (primero * segundo));
                break;
            case '/':
                if (segundo == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + (primero / segundo));
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }

        entrada.close();
    }
}
