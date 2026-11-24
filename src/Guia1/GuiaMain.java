package Guia1;

import javax.swing.JOptionPane;

public class GuiaMain {

    public void Guia1() {
        String opcion = JOptionPane.showInputDialog(null,
                "Bienvenido a la lista de ejercicios de la Guía 1\n"
                        + "1. Estructuras condicionales (ejercicios 1 al 10)\n"
                        + "2. Ciclos y arreglos (ejercicios 11 al 29)\n"
                        + "Ingrese una opción:");

        if (opcion == null) {
            return;
        }

        if (opcion.equals("1")) {
            mostrarEjerciciosCondicionales();
        } else if (opcion.equals("2")) {
            mostrarEjerciciosCiclosYArreglos();
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }

    private void mostrarEjerciciosCondicionales() {
        String opcion = JOptionPane.showInputDialog(null,
                "Ejercicios de estructuras condicionales:\n"
                        + "1. Positivo, negativo o cero\n"
                        + "2. Par o impar\n"
                        + "3. Validar edad\n"
                        + "4. Calculadora básica\n"
                        + "5. Año bisiesto\n"
                        + "6. Clasificar una nota\n"
                        + "7. Encontrar el mayor de tres números\n"
                        + "8. Calcular descuento de una compra\n"
                        + "9. Validar usuario y contraseña\n"
                        + "10. Calcular el IMC\n"
                        + "Ingrese el número del ejercicio:");

        ejecutarEjercicio(opcion, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private void mostrarEjerciciosCiclosYArreglos() {
        String opcion = JOptionPane.showInputDialog(null,
                "Ejercicios prácticos de ciclos y arreglos:\n"
                        + "11. Números del 1 al 50\n"
                        + "12. Números del 50 al 1\n"
                        + "13. Números pares del 1 al 100\n"
                        + "14. Números impares del 1 al 100\n"
                        + "15. Suma del 1 al 100\n"
                        + "16. Suma de impares del 1 al 50\n"
                        + "17. Tabla del 7\n"
                        + "18. Tablas del 1 al 10\n"
                        + "19. Contar múltiplos de 10\n"
                        + "20. Divisibles entre 3 y 5\n"
                        + "21. Factorial\n"
                        + "22. Mostrar elementos de un arreglo\n"
                        + "23. Sumar elementos de un arreglo\n"
                        + "24. Mayor número de un arreglo\n"
                        + "25. Menor número de un arreglo\n"
                        + "26. Buscar un número en un arreglo\n"
                        + "27. Cuadrado de asteriscos\n"
                        + "28. Primeros 20 números y sus cubos\n"
                        + "29. Imprimir caracteres de una cadena\n"
                        + "Ingrese el número del ejercicio:");

        ejecutarEjercicio(opcion, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
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
            case 1: Ejercicio1.main(new String[0]); break;
            case 2: Ejercicio2.main(new String[0]); break;
            case 3: Ejercicio3.main(new String[0]); break;
            case 4: Ejercicio4.main(new String[0]); break;
            case 5: Ejercicio5.main(new String[0]); break;
            case 6: Ejercicio6.main(new String[0]); break;
            case 7: Ejercicio7.main(new String[0]); break;
            case 8: Ejercicio8.main(new String[0]); break;
            case 9: Ejercicio9.main(new String[0]); break;
            case 10: Ejercicio10.main(new String[0]); break;
            case 11: Ejercicio11.main(new String[0]); break;
            case 12: Ejercicio12.main(new String[0]); break;
            case 13: Ejercicio13.main(new String[0]); break;
            case 14: Ejercicio14.main(new String[0]); break;
            case 15: Ejercicio15.main(new String[0]); break;
            case 16: Ejercicio16.main(new String[0]); break;
            case 17: Ejercicio17.main(new String[0]); break;
            case 18: Ejercicio18.main(new String[0]); break;
            case 19: Ejercicio19.main(new String[0]); break;
            case 20: Ejercicio20.main(new String[0]); break;
            case 21: Ejercicio21.main(new String[0]); break;
            case 22: Ejercicio22.main(new String[0]); break;
            case 23: Ejercicio23.main(new String[0]); break;
            case 24: Ejercicio24.main(new String[0]); break;
            case 25: Ejercicio25.main(new String[0]); break;
            case 26: Ejercicio26.main(new String[0]); break;
            case 27: Ejercicio27.main(new String[0]); break;
            case 28: Ejercicio28.main(new String[0]); break;
            case 29: Ejercicio29.main(new String[0]); break;
            default:
                JOptionPane.showMessageDialog(null, "Ese ejercicio todavía no está implementado.");
        }
    }
}
