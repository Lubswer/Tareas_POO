package Ejercicio1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio = 0;
        double iva = 0.15;

        do {
            try {
                System.out.print("Ingreser el precio del producto: ");
                precio = teclado.nextDouble();

                if (precio > 0) {
                    System.out.println("El precio con el 15%iva es: " + (precio + (precio * iva)));

                } else {
                    throw new IllegalArgumentException("Digito menor a cero: ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error, solo debe ingresar numeros");
                teclado.nextLine();
            }
        } while (precio == 0);

    }
}
