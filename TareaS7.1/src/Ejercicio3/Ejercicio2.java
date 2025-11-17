package Ejercicio3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static Estudiante crearEstudiante(Scanner teclado){
        String nombre;
        int edad;
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        while (true) {
            try {
                System.out.print("Edad: ");
                edad = teclado.nextInt();
                teclado.nextLine(); // limpiar buffer
                return new Estudiante(nombre, edad);
            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser numérica.");
                teclado.nextLine(); // limpiar buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                // volvemos a pedir los datos correctamente
                System.out.print("Nombre: ");
                nombre = teclado.nextLine();
            }
        }
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Estudiante nuevo = crearEstudiante(teclado);

        System.out.println("\nEstudiante registrado correctamente.");
        teclado.close();
    }
}

