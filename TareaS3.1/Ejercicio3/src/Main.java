import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        CuentaBancaria titular = new CuentaBancaria();
        do {
            System.out.println("/// SELECIONE UNA OPCION ///");
            System.out.println("1. Informacion del Titular");
            System.out.println("2. Hacer un deposito");
            System.out.println("3. Hacer un retiro");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            teclado = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("///DATOS:");
                    System.out.println("Titular: " + titular.getTitular());
                    System.out.println("Saldo: " + titular.getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double cantidad = teclado.nextDouble();
                    titular.setDepositar(cantidad);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double cantidadRetirado = teclado.nextDouble();
                    titular.setRetirar(cantidadRetirado);
                    break;
                case 4:
                    System.out.println("Saliendo del Sistema...");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");

            }

        } while (opcion != 4);

    }
}