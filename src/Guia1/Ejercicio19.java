package Guia1;

public class Ejercicio19 {
    public static void main(String[] args) {
        int cantidad = 0;

        for (int numero = 1; numero <= 200; numero++) {
            if (numero % 10 == 0) {
                cantidad++;
            }
        }

        System.out.println("Hay " + cantidad + " múltiplos de 10 entre 1 y 200.");
    }
}
