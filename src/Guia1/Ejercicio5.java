package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese un año para saber si es bisiesto:");
        if (texto == null) return;
        int anio = Integer.parseInt(texto);

        if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
            JOptionPane.showMessageDialog(null, "El año es bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, "El año no es bisiesto.");
        }

    }
}
