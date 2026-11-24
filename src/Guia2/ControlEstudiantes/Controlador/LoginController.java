package Guia2.ControlEstudiantes.Controlador;

import ConexionDb.ConexionDB;
import Guia2.ControlEstudiantes.Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Valida credenciales contra la tabla usuarios de la base compartida. */
public class LoginController {
    private int intentosFallidos;

    public boolean autenticar(Usuario usuario) throws SQLException {
        if (usuario == null || usuario.getUsername() == null || usuario.getPassword() == null) {
            return false;
        }

        String sql = "SELECT 1 FROM usuarios WHERE username = ? AND password = ? LIMIT 1";
        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement consulta = conexion.prepareStatement(sql)) {
            consulta.setString(1, usuario.getUsername().trim());
            consulta.setString(2, usuario.getPassword());
            try (ResultSet resultado = consulta.executeQuery()) {
                return resultado.next();
            }
        }
    }

    public int registrarIntentoFallido() {
        intentosFallidos++;
        return Math.max(0, 3 - intentosFallidos);
    }

    public boolean tieneIntentosDisponibles() {
        return intentosFallidos < 3;
    }
}
