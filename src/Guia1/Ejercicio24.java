package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio24 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            if (texto == null) return;
            numeros[i] = Integer.parseInt(texto);
        }

        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El mayor numero es: " + mayor);
    }
}
