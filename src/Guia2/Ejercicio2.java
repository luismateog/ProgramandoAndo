package Guia2;

import javax.swing.JOptionPane;

/** Excepción al intentar dividir entre cero. */
public class Ejercicio2 {
    public static void main(String[] args) {
        String textoA = JOptionPane.showInputDialog(null, "Ingrese el dividendo:");
        if (textoA == null) return;
        String textoB = JOptionPane.showInputDialog(null, "Ingrese el divisor:");
        if (textoB == null) return;
        try {
            double a = Double.parseDouble(textoA.trim().replace(',', '.'));
            double b = Double.parseDouble(textoB.trim().replace(',', '.'));
            if (b == 0) throw new ArithmeticException("El divisor no puede ser cero.");
            JOptionPane.showMessageDialog(null, "Resultado: " + (a / b));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ingrese valores numéricos válidos.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
