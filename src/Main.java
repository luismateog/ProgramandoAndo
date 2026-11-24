import javax.swing.JOptionPane;

import Guia1.GuiaMain;

public class Main {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog(null,
                "Bienvenido a Programando Ando\n"
                        + "Aquí aprenderás Java\n"
                        + "Ingrese una opción para el programa:\n"
                        + "1. Ejercicios Guía 1\n"
                        + "2. Ejercicios Guía 2");

        if (opcion == null) {
            return;
        }

        switch (opcion) {
            case "1":
                System.out.println("Ingresando a Ejercicios Guía 1");
                GuiaMain guia1 = new GuiaMain();
                guia1.Guia1();
                break;
            case "2":
                JOptionPane.showMessageDialog(null,
                        "La Guía 2 todavía no está disponible en el proyecto.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
}
