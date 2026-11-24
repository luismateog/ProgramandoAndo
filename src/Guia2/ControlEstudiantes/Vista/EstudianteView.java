package Guia2.ControlEstudiantes.Vista;

import Guia2.ControlEstudiantes.Controlador.EstudianteController;
import Guia2.ControlEstudiantes.Modelo.Estudiante;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class EstudianteView {
    private final EstudianteController controlador = new EstudianteController();

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(null,
                    "CONTROL DE ESTUDIANTES\n"
                            + "1. Agregar estudiante\n"
                            + "2. Ver estudiantes\n"
                            + "3. Actualizar estudiante\n"
                            + "4. Eliminar estudiante\n"
                            + "5. Salir\n"
                            + "Elija una opción:");

            if (opcion == null) {
                continuar = false;
            } else {
                switch (opcion) {
                    case "1":
                        agregar();
                        break;
                    case "2":
                        verTodos();
                        break;
                    case "3":
                        actualizar();
                        break;
                    case "4":
                        eliminar();
                        break;
                    case "5":
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Elija una opción del 1 al 5.");
                }
            }
        }
    }

    private void agregar() {
        Estudiante estudiante = pedirDatosEstudiante();
        if (estudiante == null) {
            return;
        }

        try {
            controlador.agregar(estudiante);
            JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            mostrarErrorBaseDatos(e);
        }
    }

    private void verTodos() {
        try {
            List<Estudiante> estudiantes = controlador.verTodos();
            if (estudiantes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                return;
            }

            StringBuilder lista = new StringBuilder();
            for (Estudiante estudiante : estudiantes) {
                lista.append("ID: ").append(estudiante.getId()).append("\n")
                        .append("Código: ").append(estudiante.getCodigo()).append("\n")
                        .append("Nombre: ").append(estudiante.getNombres()).append(" ")
                        .append(estudiante.getApellidos()).append("\n")
                        .append("Programa: ").append(estudiante.getPrograma()).append("\n")
                        .append("Correo: ").append(estudiante.getCorreo()).append("\n")
                        .append("Estado: ").append(estudiante.getEstado()).append("\n")
                        .append("------------------------------\n");
            }

            JOptionPane.showMessageDialog(null, lista.toString(),
                    "Estudiantes registrados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            mostrarErrorBaseDatos(e);
        }
    }

    private void actualizar() {
        Integer id = pedirId("Ingrese el ID del estudiante que desea actualizar:");
        if (id == null) {
            return;
        }

        Estudiante estudiante = pedirDatosEstudiante();
        if (estudiante == null) {
            return;
        }

        try {
            if (controlador.actualizar(id, estudiante)) {
                JOptionPane.showMessageDialog(null, "Estudiante actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe un estudiante con ese ID.");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            mostrarErrorBaseDatos(e);
        }
    }

    private void eliminar() {
        Integer id = pedirId("Ingrese el ID del estudiante que desea eliminar:");
        if (id == null) {
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null,
                "¿Confirma que desea eliminar el estudiante con ID " + id + "?",
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            if (controlador.eliminar(id)) {
                JOptionPane.showMessageDialog(null, "Estudiante eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No existe un estudiante con ese ID.");
            }
        } catch (SQLException e) {
            mostrarErrorBaseDatos(e);
        }
    }

    private Estudiante pedirDatosEstudiante() {
        String codigo = pedirTexto("Código del estudiante:");
        if (codigo == null) return null;

        String nombres = pedirTexto("Nombres:");
        if (nombres == null) return null;

        String apellidos = pedirTexto("Apellidos:");
        if (apellidos == null) return null;

        String programa = pedirTexto("Programa o curso:");
        if (programa == null) return null;

        String correo = pedirTexto("Correo electrónico:");
        if (correo == null) return null;

        String estado = pedirTexto("Estado (Activo o Inactivo):");
        if (estado == null) return null;

        return new Estudiante(codigo, nombres, apellidos, programa, correo, estado);
    }

    private String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    private Integer pedirId(String mensaje) {
        String textoId = JOptionPane.showInputDialog(null, mensaje);
        if (textoId == null) {
            return null;
        }

        try {
            int id = Integer.parseInt(textoId.trim());
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número mayor que cero.");
                return null;
            }
            return id;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.");
            return null;
        }
    }

    private void mostrarErrorBaseDatos(SQLException e) {
        String mensaje = e.getMessage();
        if (mensaje != null && mensaje.contains("UNIQUE constraint failed: estudiantes.codigo")) {
            JOptionPane.showMessageDialog(null, "Ese código ya está registrado.");
        } else {
            JOptionPane.showMessageDialog(null, "Error de base de datos: " + mensaje);
        }
    }
}
