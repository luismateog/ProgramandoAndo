package Guia2.ControlEstudiantes.Controlador;

import ConexionDb.ConexionDB;
import Guia2.ControlEstudiantes.Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteController {

    public void agregar(Estudiante estudiante) throws SQLException {
        validarEstudiante(estudiante);

        String sql = "INSERT INTO estudiantes "
                + "(codigo, nombres, apellidos, programa, correo, estado) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            ponerDatos(sentencia, estudiante);
            sentencia.executeUpdate();
        }
    }

    public List<Estudiante> verTodos() throws SQLException {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT id, codigo, nombres, apellidos, programa, correo, estado "
                + "FROM estudiantes ORDER BY id";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Estudiante estudiante = new Estudiante(
                        resultado.getInt("id"),
                        resultado.getString("codigo"),
                        resultado.getString("nombres"),
                        resultado.getString("apellidos"),
                        resultado.getString("programa"),
                        resultado.getString("correo"),
                        resultado.getString("estado"));
                estudiantes.add(estudiante);
            }
        }

        return estudiantes;
    }

    public boolean actualizar(int id, Estudiante estudiante) throws SQLException {
        validarEstudiante(estudiante);

        String sql = "UPDATE estudiantes SET codigo = ?, nombres = ?, apellidos = ?, "
                + "programa = ?, correo = ?, estado = ? WHERE id = ?";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            ponerDatos(sentencia, estudiante);
            sentencia.setInt(7, id);
            return sentencia.executeUpdate() > 0;
        }
    }

    public boolean eliminar(int id) throws SQLException {
        String sql = "DELETE FROM estudiantes WHERE id = ?";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setInt(1, id);
            return sentencia.executeUpdate() > 0;
        }
    }

    private void ponerDatos(PreparedStatement sentencia, Estudiante estudiante) throws SQLException {
        sentencia.setString(1, estudiante.getCodigo().trim());
        sentencia.setString(2, estudiante.getNombres().trim());
        sentencia.setString(3, estudiante.getApellidos().trim());
        sentencia.setString(4, estudiante.getPrograma().trim());
        sentencia.setString(5, estudiante.getCorreo().trim());
        sentencia.setString(6, estudiante.getEstado().trim());
    }

    private void validarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            throw new IllegalArgumentException("No se recibieron los datos del estudiante.");
        }

        if (estaVacio(estudiante.getCodigo())
                || estaVacio(estudiante.getNombres())
                || estaVacio(estudiante.getApellidos())
                || estaVacio(estudiante.getPrograma())
                || estaVacio(estudiante.getCorreo())
                || estaVacio(estudiante.getEstado())) {
            throw new IllegalArgumentException("Todos los campos son obligatorios.");
        }

        String correo = estudiante.getCorreo().trim();
        int posicionArroba = correo.indexOf('@');
        int posicionPunto = correo.lastIndexOf('.');
        if (posicionArroba <= 0 || posicionPunto <= posicionArroba + 1
                || posicionPunto == correo.length() - 1) {
            throw new IllegalArgumentException("Ingrese un correo válido.");
        }

        String estado = estudiante.getEstado().trim();
        if (!estado.equalsIgnoreCase("Activo") && !estado.equalsIgnoreCase("Inactivo")) {
            throw new IllegalArgumentException("El estado debe ser Activo o Inactivo.");
        }
    }

    private boolean estaVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }
}
