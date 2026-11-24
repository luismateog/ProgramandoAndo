package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            if (texto == null) return;
            numeros[i] = Integer.parseInt(texto);
        }

        String textoValor = JOptionPane.showInputDialog("Ingrese el valor que desea buscar:");
        if (textoValor == null) return;
        int valor = Integer.parseInt(textoValor);

        int ocurrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                ocurrencias++;
            }
        }

        JOptionPane.showMessageDialog(null, "El valor aparece " + ocurrencias + " veces.");
    }
}
