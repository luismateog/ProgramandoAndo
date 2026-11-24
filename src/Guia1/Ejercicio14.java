package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {
        // El arreglo guarda el inicio y el final del rango.
        int[] rango = {1, 100};
        int numero = rango[0];
        StringBuilder resultado = new StringBuilder();

        while (numero <= rango[1]) {
            if (numero % 2 != 0) {
                resultado.append(numero).append("\n");
            }
            numero++;
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
