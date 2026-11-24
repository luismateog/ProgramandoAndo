package Guia1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("Ingrese la contrasena: ");
        String contrasena = entrada.nextLine();

        if (usuario.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Credenciales incorrectas");
        }

        entrada.close();
    }
}
