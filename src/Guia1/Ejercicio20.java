package Guia1;

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Numeros divisibles entre 3 y 5 entre 1 y 100:");

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println(numero);
            }
        }
    }
}
