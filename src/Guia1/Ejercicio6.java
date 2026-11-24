package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una nota entre 0 y 100:");
        if (texto == null) return;
        double nota = Double.parseDouble(texto);

        if (nota < 0 || nota > 100) {
            JOptionPane.showMessageDialog(null, "La nota esta fuera del rango permitido.");
        } else if (nota >= 90) {
            JOptionPane.showMessageDialog(null, "Excelente");
        } else if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "Bueno");
        } else if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aceptable");
        } else if (nota >= 60) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else {
            JOptionPane.showMessageDialog(null, "Reprobado");
        }

    }
}
