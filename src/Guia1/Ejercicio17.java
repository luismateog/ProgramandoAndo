package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int numero = 1; numero <= 10; numero++) {
            resultado.append("7 x ").append(numero).append(" = ").append(7 * numero).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
