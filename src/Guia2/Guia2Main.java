package Guia2;

import ConexionDb.InicializarDB;
import Guia2.ControlEstudiantes.Vista.LoginView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/** Punto de entrada de los ejercicios de excepciones y del control de estudiantes. */
public class Guia2Main {
    public static void main(String[] args) {
        try {
            InicializarDB.crearTablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo inicializar la base de datos: " + e.getMessage(),
                    "Error de base de datos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String opcion = JOptionPane.showInputDialog(null,
                "GUÍA 2\n"
                        + "1. Ejercicios de excepciones\n"
                        + "2. Control de estudiantes (iniciar sesión)\n"
                        + "3. Salir\n"
                        + "Elija una opción:");
        if (opcion == null || opcion.equals("3")) return;

        switch (opcion) {
            case "1":
                mostrarEjercicios();
                break;
            case "2":
                new LoginView().iniciar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elija una opción del 1 al 3.");
        }
    }

    private static void mostrarEjercicios() {
        String opcion = JOptionPane.showInputDialog(null,
                "EJERCICIOS DE EXCEPCIONES\n"
                        + "1. Formato numérico\n"
                        + "2. División entre cero\n"
                        + "3. Cálculo de IMC\n"
                        + "4. Estatura cero\n"
                        + "5. Índice de arreglo inválido\n"
                        + "6. Número fuera de rango\n"
                        + "7. Cancelación de diálogo\n"
                        + "Elija una opción:");
        if (opcion == null) return;
        switch (opcion) {
            case "1": Ejercicio1.main(new String[0]); break;
            case "2": Ejercicio2.main(new String[0]); break;
            case "3": Ejercicio3.main(new String[0]); break;
            case "4": Ejercicio4.main(new String[0]); break;
            case "5": Ejercicio5.main(new String[0]); break;
            case "6": Ejercicio6.main(new String[0]); break;
            case "7": Ejercicio7.main(new String[0]); break;
            default: JOptionPane.showMessageDialog(null, "Elija una opción del 1 al 7.");
        }
    }
}
