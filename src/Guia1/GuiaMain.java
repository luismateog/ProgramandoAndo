package Guia1;

import javax.swing.JOptionPane;

public class GuiaMain {

    public void Guia1() {
        String opcion = JOptionPane.showInputDialog(null,
                "Bienvenido a la lista de ejercicios de la Guía 1\n"
                        + "1. Ejercicios de estructuras condicionales\n"
                        + "2. Ejercicios prácticos: ciclos y arreglos\n"
                        + "Ingrese una opción:");

        if (opcion == null) {
            return;
        }

        switch (opcion) {
            case "1":
                mostrarEjerciciosCondicionales();
                break;
            case "2":
                mostrarEjerciciosCiclosYArreglos();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }

    private void mostrarEjerciciosCondicionales() {
        String opcion = JOptionPane.showInputDialog(null,
                "Ejercicios de estructuras condicionales:\n"
                        + "6. Clasificar una nota\n"
                        + "7. Encontrar el mayor de tres números\n"
                        + "8. Calcular descuento de una compra\n"
                        + "9. Validar usuario y contraseña\n"
                        + "10. Calcular el IMC\n"
                        + "Ingrese el número del ejercicio:");

        ejecutarEjercicio(opcion, 6, 7, 8, 9, 10);
    }

    private void mostrarEjerciciosCiclosYArreglos() {
        String opcion = JOptionPane.showInputDialog(null,
                "Ejercicios prácticos de ciclos y arreglos:\n"
                        + "20. Números divisibles entre 3 y 5\n"
                        + "21. Calcular factorial\n"
                        + "22. Ingresar y mostrar números\n"
                        + "23. Sumar números\n"
                        + "24. Encontrar el número mayor\n"
                        + "25. Encontrar el número menor\n"
                        + "26. Contar las veces que aparece un valor\n"
                        + "27. Imprimir un cuadrado de asteriscos\n"
                        + "28. Mostrar números elevados al cubo\n"
                        + "29. Imprimir cada carácter de una cadena\n"
                        + "Ingrese el número del ejercicio:");

        ejecutarEjercicio(opcion, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
    }

    private void ejecutarEjercicio(String opcion, int... ejerciciosDisponibles) {
        if (opcion == null) {
            return;
        }

        int numeroEjercicio;
        try {
            numeroEjercicio = Integer.parseInt(opcion);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de ejercicio válido.");
            return;
        }

        for (int ejercicio : ejerciciosDisponibles) {
            if (numeroEjercicio == ejercicio) {
                JOptionPane.showMessageDialog(null, "Ingresando al Ejercicio " + ejercicio);
                ejecutarMainEjercicio(ejercicio);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Ese ejercicio no está disponible en esta categoría.");
    }

    private void ejecutarMainEjercicio(int ejercicio) {
        switch (ejercicio) {
            case 6:
                Ejercicio6.main(new String[0]);
                break;
            case 7:
                Ejercicio7.main(new String[0]);
                break;
            case 8:
                Ejercicio8.main(new String[0]);
                break;
            case 9:
                Ejercicio9.main(new String[0]);
                break;
            case 10:
                Ejercicio10.main(new String[0]);
                break;
            case 20:
                Ejercicio20.main(new String[0]);
                break;
            case 21:
                Ejercicio21.main(new String[0]);
                break;
            case 22:
                Ejercicio22.main(new String[0]);
                break;
            case 23:
                Ejercicio23.main(new String[0]);
                break;
            case 24:
                Ejercicio24.main(new String[0]);
                break;
            case 25:
                Ejercicio25.main(new String[0]);
                break;
            case 26:
                Ejercicio26.main(new String[0]);
                break;
            case 27:
                Ejercicio27.main(new String[0]);
                break;
            case 28:
                Ejercicio28.main(new String[0]);
                break;
            case 29:
                Ejercicio29.main(new String[0]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ese ejercicio todavía no está implementado.");
        }
    }
}
