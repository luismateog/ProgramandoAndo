package Guia2;

import javax.swing.JOptionPane;

/** Excepción por número fuera del rango permitido. */
public class Ejercicio6 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Ingrese un número entre 1 y 100:");
        if (texto == null) return;
        try {
            int numero = Integer.parseInt(texto.trim());
            if (numero < 1 || numero > 100) throw new IllegalArgumentException("El número debe estar entre 1 y 100.");
            JOptionPane.showMessageDialog(null, "Número válido: " + numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debe ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
