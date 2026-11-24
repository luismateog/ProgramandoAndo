package Guia2.ControlEstudiantes.Vista;

import ConexionDb.InicializarDB;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlEstudiantesMain {
    public static void main(String[] args) {
        try {
            InicializarDB.crearTablas();
            new EstudianteView().iniciar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo iniciar la base de datos: " + e.getMessage());
        }
    }
}
