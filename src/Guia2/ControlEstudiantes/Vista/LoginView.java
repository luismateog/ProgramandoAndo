package Guia2.ControlEstudiantes.Vista;

import Guia2.ControlEstudiantes.Controlador.LoginController;
import Guia2.ControlEstudiantes.Modelo.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/** Gestiona el inicio de sesión y vuelve al login al cerrar el módulo CRUD. */
public class LoginView {
    private final LoginController controlador = new LoginController();

    public void iniciar() {
        while (controlador.tieneIntentosDisponibles()) {
            String username = pedirUsuario();
            if (username == null) return;
            if (username.trim().isEmpty()) {
                int restantes = controlador.registrarIntentoFallido();
                mostrarMensaje(restantes == 0
                        ? "Acceso bloqueado: se alcanzaron tres intentos fallidos."
                        : "El usuario no puede estar vacío. Intentos restantes: " + restantes);
                continue;
            }

            String password = pedirContrasena();
            if (password == null) return;

            try {
                if (controlador.autenticar(new Usuario(username.trim(), password))) {
                    mostrarMensaje("Inicio de sesión correcto.");
                    abrirModuloEstudiantes();
                    mostrarMensaje("Sesión cerrada.");
                } else {
                    int restantes = controlador.registrarIntentoFallido();
                    mostrarMensaje(restantes == 0
                            ? "Acceso bloqueado: se alcanzaron tres intentos fallidos."
                            : "Usuario o contraseña incorrectos. Intentos restantes: " + restantes);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo validar el acceso: " + e.getMessage(),
                        "Error de base de datos", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    protected String pedirUsuario() {
        return JOptionPane.showInputDialog(null, "Ingrese su usuario:", "Iniciar sesión",
                JOptionPane.QUESTION_MESSAGE);
    }

    protected String pedirContrasena() {
        JPasswordField campoPassword = new JPasswordField();
        int opcion = JOptionPane.showConfirmDialog(null, campoPassword, "Ingrese su contraseña",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        return opcion == JOptionPane.OK_OPTION ? new String(campoPassword.getPassword()) : null;
    }

    protected void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    protected void abrirModuloEstudiantes() {
        new EstudianteView().iniciar();
    }
}
