package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese su edad:");
        if (texto == null) return;
        int edad = Integer.parseInt(texto);

        if (edad < 0) {
            JOptionPane.showMessageDialog(null, "Edad inválida");
        } else if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede ingresar");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }

    }
}
