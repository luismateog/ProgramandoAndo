package Guia1;

public class Ejercicio14 {
    public static void main(String[] args) {
        // El arreglo guarda el inicio y el final del rango.
        int[] rango = {1, 100};
        int numero = rango[0];

        while (numero <= rango[1]) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
