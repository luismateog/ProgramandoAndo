package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        for (int tabla = 1; tabla <= 10; tabla++) {
            resultado.append("Tabla del ").append(tabla).append(":\n");

            for (int numero = 1; numero <= 10; numero++) {
                resultado.append(tabla).append(" x ").append(numero).append(" = ")
                        .append(tabla * numero).append("\n");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
