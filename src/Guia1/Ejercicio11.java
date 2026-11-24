package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int numero = 1; numero <= 50; numero++) {
            resultado.append(numero).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
