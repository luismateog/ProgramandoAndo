package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio27 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                resultado.append("* ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
