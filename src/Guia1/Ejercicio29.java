package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio29 {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        if (cadena == null) return;

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            resultado.append(cadena.charAt(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
