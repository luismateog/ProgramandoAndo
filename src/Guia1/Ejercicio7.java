package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        String textoPrimero = JOptionPane.showInputDialog("Ingrese el primer numero:");
        if (textoPrimero == null) return;
        String textoSegundo = JOptionPane.showInputDialog("Ingrese el segundo numero:");
        if (textoSegundo == null) return;
        String textoTercero = JOptionPane.showInputDialog("Ingrese el tercer numero:");
        if (textoTercero == null) return;
        double primero = Double.parseDouble(textoPrimero);
        double segundo = Double.parseDouble(textoSegundo);
        double tercero = Double.parseDouble(textoTercero);

        double mayor = primero;
        if (segundo > mayor) {
            mayor = segundo;
        }
        if (tercero > mayor) {
            mayor = tercero;
        }

        int cantidadMayores = 0;
        if (primero == mayor) {
            cantidadMayores++;
        }
        if (segundo == mayor) {
            cantidadMayores++;
        }
        if (tercero == mayor) {
            cantidadMayores++;
        }

        String resultado = "El mayor es: " + mayor;
        if (cantidadMayores == 2) {
            resultado += "\nHay un empate entre dos numeros.";
        } else if (cantidadMayores == 3) {
            resultado += "\nHay un empate entre los tres numeros.";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
