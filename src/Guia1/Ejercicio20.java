package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Numeros divisibles entre 3 y 5 entre 1 y 100:\n");

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                resultado.append(numero).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
