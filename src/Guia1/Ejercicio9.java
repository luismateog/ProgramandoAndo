package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Ingrese el usuario:");
        if (usuario == null) return;
        String contrasena = JOptionPane.showInputDialog("Ingrese la contrasena:");
        if (contrasena == null) return;

        if (usuario.equals("admin") && contrasena.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }

    }
}
