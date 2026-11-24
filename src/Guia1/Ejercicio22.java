package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            if (texto == null) return;
            numeros[i] = Integer.parseInt(texto);
        }

        StringBuilder resultado = new StringBuilder("Numeros ingresados:\n");
        for (int i = 0; i < numeros.length; i++) {
            resultado.append(numeros[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
