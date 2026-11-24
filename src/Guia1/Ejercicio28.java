package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio28 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int numero = 1; numero <= 20; numero++) {
            int cubo = numero * numero * numero;
            resultado.append(numero).append(" al cubo es ").append(cubo).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
