package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio25 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            if (texto == null) return;
            numeros[i] = Integer.parseInt(texto);
        }

        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El menor numero es: " + menor);
    }
}
