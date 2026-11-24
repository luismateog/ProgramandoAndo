import javax.swing.JOptionPane;

import Guia1.GuiaMain;
import Guia2.Guia2Main;

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
                JOptionPane.showMessageDialog(null, "Ingresando a Ejercicios Guía 1");
                GuiaMain guia1 = new GuiaMain();
                guia1.Guia1();
                break;
            case "2":
                Guia2Main.main(new String[0]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
}
