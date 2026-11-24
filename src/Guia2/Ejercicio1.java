package Guia2;

import javax.swing.JOptionPane;

/** Excepción por formato numérico inválido. */
public class Ejercicio1 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese un número entero:");
        if (entrada == null) return;
        try {
            int numero = Integer.parseInt(entrada.trim());
            JOptionPane.showMessageDialog(null, "Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debe ingresar un número entero válido.");
        }
    }
}
