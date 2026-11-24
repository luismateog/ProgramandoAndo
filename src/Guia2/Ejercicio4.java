package Guia2;

import javax.swing.JOptionPane;

/** Maneja el caso especial de estatura cero al calcular el IMC. */
public class Ejercicio4 {
    public static void main(String[] args) {
        String textoPeso = JOptionPane.showInputDialog(null, "Ingrese el peso en kilogramos:");
        if (textoPeso == null) return;
        String textoEstatura = JOptionPane.showInputDialog(null, "Ingrese la estatura en metros:");
        if (textoEstatura == null) return;
        try {
            double peso = Double.parseDouble(textoPeso.trim().replace(',', '.'));
            double estatura = Double.parseDouble(textoEstatura.trim().replace(',', '.'));
            if (estatura == 0) throw new ArithmeticException("La estatura no puede ser cero.");
            if (peso < 0 || estatura < 0) throw new IllegalArgumentException("Los valores no pueden ser negativos.");
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", peso / (estatura * estatura)));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ingrese valores numéricos válidos.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
