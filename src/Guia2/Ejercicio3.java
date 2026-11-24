package Guia2;

import javax.swing.JOptionPane;

/** Cálculo de IMC con validación de los valores ingresados. */
public class Ejercicio3 {
    public static void main(String[] args) {
        String textoPeso = JOptionPane.showInputDialog(null, "Ingrese el peso en kilogramos:");
        if (textoPeso == null) return;
        String textoEstatura = JOptionPane.showInputDialog(null, "Ingrese la estatura en metros:");
        if (textoEstatura == null) return;
        try {
            double peso = Double.parseDouble(textoPeso.trim().replace(',', '.'));
            double estatura = Double.parseDouble(textoEstatura.trim().replace(',', '.'));
            if (peso <= 0 || estatura <= 0) throw new IllegalArgumentException("Peso y estatura deben ser mayores que cero.");
            double imc = peso / (estatura * estatura);
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", imc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: ingrese peso y estatura como números válidos.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
