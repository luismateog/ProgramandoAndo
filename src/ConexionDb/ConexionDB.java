package ConexionDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Abre la conexión compartida con la base de datos del proyecto. */
public class ConexionDB {
    private static final String URL = "jdbc:sqlite:mibasededatos.db";

    private ConexionDB() {
        // Esta clase solo ofrece el método estático conectar().
    }

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
