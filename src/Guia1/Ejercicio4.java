package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        String textoPrimero = JOptionPane.showInputDialog("Ingrese el primer número:");
        if (textoPrimero == null) return;
        String textoSegundo = JOptionPane.showInputDialog("Ingrese el segundo número:");
        if (textoSegundo == null) return;
        String textoOperador = JOptionPane.showInputDialog("Ingrese un operador (+, -, *, /):");
        if (textoOperador == null || textoOperador.isEmpty()) return;
        double primero = Double.parseDouble(textoPrimero);
        double segundo = Double.parseDouble(textoSegundo);
        char operador = textoOperador.charAt(0);

        switch (operador) {
            case '+':
                JOptionPane.showMessageDialog(null, "Resultado: " + (primero + segundo));
                break;
            case '-':
                JOptionPane.showMessageDialog(null, "Resultado: " + (primero - segundo));
                break;
            case '*':
                JOptionPane.showMessageDialog(null, "Resultado: " + (primero * segundo));
                break;
            case '/':
                if (segundo == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
                } else {
                    JOptionPane.showMessageDialog(null, "Resultado: " + (primero / segundo));
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador no válido.");
        }

    }
}
