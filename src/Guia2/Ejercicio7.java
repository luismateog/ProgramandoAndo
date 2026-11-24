package Guia2;

import javax.swing.JOptionPane;

/** Maneja explícitamente la cancelación de un diálogo de entrada. */
public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
            if (nombre == null) throw new DialogoCanceladoException();
            if (nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
            JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre.trim() + ".");
        } catch (DialogoCanceladoException e) {
            JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    private static class DialogoCanceladoException extends Exception { }
}
