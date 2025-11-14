package main.util;

import main.cliente.Cliente;
import main.empleado.balcon.Balcon;
import main.empleado.cajero.Cajero;
import main.empleado.jefe.Jefe;

import java.util.Scanner;

public class Fabricas {

    private static Scanner sc = new Scanner(System.in);

    public static Cliente crearCliente() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasenia = sc.nextLine();

        return new Cliente(nombre, cedula, telefono, contrasenia);
    }

    public static Cajero crearCajero() {
        return new Cajero("Cajero1", "1111", "0999999999", "pass", "Cajero");
    }

    public static Balcon crearBalcon() {
        return new Balcon("Balcon1", "2222", "0888888888", "pass", "Balcón");
    }

    public static Jefe crearJefe() {
        return new Jefe("Jefe1", "3333", "0777777777", "pass", "Jefe");
    }
}
