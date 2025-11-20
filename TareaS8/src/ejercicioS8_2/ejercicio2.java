package ejercicioS8_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        try {
            System.out.println("=== Registro de Dispositivos ===");
            // Registrar un teléfono
            try {
                System.out.println("\n--- Registrar TELÉFONO ---");
                System.out.print("Marca: ");
                String marcaT = teclado.nextLine();
                System.out.print("Modelo: ");
                String modeloT = teclado.nextLine();
                System.out.print("Precio: ");
                double precioT = teclado.nextDouble();
                teclado.nextLine();

                Telefono tel = new Telefono(marcaT, modeloT, precioT);
                dispositivos.add(tel);
                System.out.println("Teléfono registrado!");
            } catch (DatoInvalidoException | InputMismatchException e) {
                System.out.println("ERROR al registrar teléfono: " + e.getMessage());
                teclado.nextLine();
            }

            // Registrar una laptop
            try {
                System.out.println("\n--- Registrar LAPTOP ---");
                System.out.print("Marca: ");
                String marcaL = teclado.nextLine();
                System.out.print("Modelo: ");
                String modeloL = teclado.nextLine();
                System.out.print("Precio: ");
                double precioL = teclado.nextDouble();
                teclado.nextLine();

                Laptop lap = new Laptop(marcaL, modeloL, precioL);
                dispositivos.add(lap);
                System.out.println("Laptop registrada!");
            } catch (DatoInvalidoException e) {
                System.out.println("ERROR al registrar laptop: " + e.getMessage());
                teclado.nextLine();
            }

            // Mostrar todos los dispositivos usando polimorfismo
            System.out.println("\n=== Lista de dispositivos registrados ===");
            if (dispositivos.isEmpty()) {
                System.out.println("No existen dispositivos registrados.");
            } else {
                for (Dispositivo d : dispositivos) {
                    d.mostrarInfo();
                    System.out.println("--------------------");
                }
            }

        } catch (Exception e) {
            System.out.println("ERROR inesperado: " + e.getMessage());
        }

        teclado.close();
    }
}
