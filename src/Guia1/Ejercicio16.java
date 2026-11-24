package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args) {
        // El arreglo guarda el inicio y el final del rango.
        int[] rango = {1, 50};
        int suma = 0;

        for (int numero = rango[0]; numero <= rango[1]; numero++) {
            if (numero % 2 != 0) {
                suma += numero;
            }
        }

        JOptionPane.showMessageDialog(null, "La suma de los números impares del 1 al 50 es: " + suma);
    }
}
