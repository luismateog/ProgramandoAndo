package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        String textoPeso = JOptionPane.showInputDialog("Ingrese el peso en kg:");
        if (textoPeso == null) return;
        String textoAltura = JOptionPane.showInputDialog("Ingrese la altura en m:");
        if (textoAltura == null) return;
        double peso = Double.parseDouble(textoPeso);
        double altura = Double.parseDouble(textoAltura);

        if (peso <= 0 || altura <= 0) {
            JOptionPane.showMessageDialog(null, "El peso y la altura deben ser mayores que cero.");
        } else {
            double imc = peso / (altura * altura);
            String resultado = String.format("IMC: %.2f\n", imc);

            if (imc < 18.5) {
                resultado += "Bajo peso";
            } else if (imc < 25) {
                resultado += "Normal";
            } else if (imc < 30) {
                resultado += "Sobrepeso";
            } else {
                resultado += "Obesidad";
            }
            JOptionPane.showMessageDialog(null, resultado);
        }

    }
}
