package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese el valor de la compra: $");
        if (texto == null) return;
        double compra = Double.parseDouble(texto);

        if (compra < 0) {
            JOptionPane.showMessageDialog(null, "El valor de la compra no puede ser negativo.");
        } else {
            double porcentajeDescuento = 0;

            if (compra > 500000) {
                porcentajeDescuento = 0.20;
            } else if (compra > 200000) {
                porcentajeDescuento = 0.15;
            } else if (compra > 100000) {
                porcentajeDescuento = 0.10;
            }

            double descuento = compra * porcentajeDescuento;
            double total = compra - descuento;

            JOptionPane.showMessageDialog(null, String.format(
                    "Valor original: $%.2f\nDescuento: $%.2f\nTotal a pagar: $%.2f",
                    compra, descuento, total));
        }

    }
}
