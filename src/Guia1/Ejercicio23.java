package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            if (texto == null) return;
            numeros[i] = Integer.parseInt(texto);
            suma += numeros[i];
        }

        JOptionPane.showMessageDialog(null, "La suma de los elementos es: " + suma);
    }
}
