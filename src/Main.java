import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido A Programando Ando");
        System.out.println("Aquí Aprenderás Java");
        System.out.println("Ingrese una opción para el programa:");

        for (int i = 1; i <= 29; i++) {
            System.out.println(i + ". Ejercicio Guía 1 - Ejercicio " + i);
        }

        int opcion;
        try {
            opcion = input.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("La opción debe ser un número entero.");
            return;
        }

        if (opcion < 1 || opcion > 29) {
            System.out.println("Opción no válida. Seleccione un número entre 1 y 29.");
            return;
        }

        System.out.println("Ingresando al Ejercicio " + opcion + " de la Guía 1...");

        try {
            Class<?> ejercicio = Class.forName("Guia1.Ejercicio" + opcion);
            ejercicio.getMethod("main", String[].class).invoke(null, (Object) args);
        } catch (ClassNotFoundException e) {
            System.out.println("El Ejercicio " + opcion + " todavía no tiene una clase creada.");
        } catch (NoSuchMethodException e) {
            System.out.println("El Ejercicio " + opcion + " no tiene un método main para ejecutarse.");
        } catch (ReflectiveOperationException e) {
            System.out.println("No se pudo ejecutar el Ejercicio " + opcion + ".");
            Throwable causa = e.getCause();
            if (causa != null) {
                causa.printStackTrace();
            }
        }
    }
}
