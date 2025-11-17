package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio = 0;
        double iva = 0.15;
        int opcion = 0;
        do {
            try {

                System.out.println(">> Opciones");
                System.out.println("1.Carcular IVA\n2.Salir");
                System.out.print("ingres una opcion: ");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
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
                        break;
                    case 2:
                        System.out.println("Salliendo...");
                        break;
                    default:
                        throw new IllegalArgumentException("Digito fuera del rango");

                }


            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(" Error, no debe ingresar letras ");
                teclado.nextLine();
            }
        } while (opcion != 2);
        teclado.close();
    }

}
