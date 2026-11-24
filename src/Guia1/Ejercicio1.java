package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese un número entero:");
        if (texto == null) return;
        int numero = Integer.parseInt(texto);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Cero");
        }

    }
}
