package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static void main(String[] args) {
        // El arreglo guarda el inicio y el final del rango.
        int[] rango = {1, 100};
        int suma = 0;

        for (int numero = rango[0]; numero <= rango[1]; numero++) {
            suma += numero;
        }

        JOptionPane.showMessageDialog(null, "La suma del 1 al 100 es: " + suma);
    }
}
