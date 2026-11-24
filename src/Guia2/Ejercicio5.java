package Guia2;

import javax.swing.JOptionPane;

/** Excepción por índice inválido en un arreglo. */
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        String texto = JOptionPane.showInputDialog(null, "Arreglo de 5 elementos. Ingrese un índice (0 a 4):");
        if (texto == null) return;
        try {
            int indice = Integer.parseInt(texto.trim());
            JOptionPane.showMessageDialog(null, "Valor: " + valores[indice]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: el índice debe ser un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error: índice fuera del arreglo; use un valor entre 0 y 4.");
        }
    }
}
