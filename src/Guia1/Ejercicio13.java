package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {
        // El arreglo guarda el inicio y el final del rango.
        int[] rango = {1, 100};

        StringBuilder resultado = new StringBuilder();
        for (int numero = rango[0]; numero <= rango[1]; numero++) {
            if (numero % 2 == 0) {
                resultado.append(numero).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
