package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese un número entero:");
        if (texto == null) return;
        int numero = Integer.parseInt(texto);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Par");
        } else {
            JOptionPane.showMessageDialog(null, "Impar");
        }

    }
}
