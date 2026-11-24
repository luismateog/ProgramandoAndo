package Guia1;

public class Ejercicio12 {
    public static void main(String[] args) {
        // El arreglo guarda el inicio y el final del rango.
        int[] rango = {50, 1};

        for (int numero = rango[0]; numero >= rango[1]; numero--) {
            System.out.println(numero);
        }
    }
}
