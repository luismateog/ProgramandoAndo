package Guia1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        double peso = entrada.nextDouble();
        System.out.print("Ingrese la altura en m: ");
        double altura = entrada.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("El peso y la altura deben ser mayores que cero.");
        } else {
            double imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Bajo peso");
            } else if (imc < 25) {
                System.out.println("Normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }
        }

        entrada.close();
    }
}
