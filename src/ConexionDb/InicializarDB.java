package ConexionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/** Crea las tablas de Guía 2 y agrega datos de ejemplo sin duplicarlos. */
public class InicializarDB {

    private InicializarDB() {
    }

    public static void crearTablas() throws SQLException {
        try (Connection conexion = ConexionDB.getConexion();
             Statement sentencia = conexion.createStatement()) {

            sentencia.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS productos ("
                            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                            + "nombre TEXT NOT NULL, "
                            + "precio REAL NOT NULL, "
                            + "cantidad INTEGER NOT NULL)");

            sentencia.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS usuarios ("
                            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                            + "username TEXT NOT NULL UNIQUE, "
                            + "password TEXT NOT NULL)");

            sentencia.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS estudiantes ("
                            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                            + "codigo TEXT NOT NULL UNIQUE, "
                            + "nombres TEXT NOT NULL, "
                            + "apellidos TEXT NOT NULL, "
                            + "programa TEXT NOT NULL, "
                            + "correo TEXT NOT NULL, "
                            + "estado TEXT NOT NULL)");
        }

        insertarUsuariosDePrueba();
        insertarEstudiantesDePrueba();
    }

    private static void insertarUsuariosDePrueba() throws SQLException {
        String sql = "INSERT OR IGNORE INTO usuarios (username, password) VALUES (?, ?)";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            insertarUsuario(sentencia, "admin", "admin123");
            insertarUsuario(sentencia, "empleado", "emp456");
        }
    }

    private static void insertarUsuario(PreparedStatement sentencia, String usuario, String contrasena)
            throws SQLException {
        sentencia.setString(1, usuario);
        sentencia.setString(2, contrasena);
        sentencia.executeUpdate();
    }

    private static void insertarEstudiantesDePrueba() throws SQLException {
        String sql = "INSERT OR IGNORE INTO estudiantes "
                + "(codigo, nombres, apellidos, programa, correo, estado) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            insertarEstudiante(sentencia, "EST001", "Ana", "Gómez", "Análisis y Desarrollo de Software",
                    "ana.gomez@example.com", "Activo");
            insertarEstudiante(sentencia, "EST002", "Luis", "Pérez", "Análisis y Desarrollo de Software",
                    "luis.perez@example.com", "Activo");
            insertarEstudiante(sentencia, "EST003", "Sofía", "Ramírez", "Análisis y Desarrollo de Software",
                    "sofia.ramirez@example.com", "Activo");
        }
    }

    private static void insertarEstudiante(PreparedStatement sentencia, String codigo, String nombres,
            String apellidos, String programa, String correo, String estado) throws SQLException {
        sentencia.setString(1, codigo);
        sentencia.setString(2, nombres);
        sentencia.setString(3, apellidos);
        sentencia.setString(4, programa);
        sentencia.setString(5, correo);
        sentencia.setString(6, estado);
        sentencia.executeUpdate();
    }
}
