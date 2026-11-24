package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio21 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese un numero entero no negativo:");
        if (texto == null) return;
        int numero = Integer.parseInt(texto);

        if (numero < 0 || numero > 20) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 y 20 para evitar desbordamiento.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
        }

    }
}
