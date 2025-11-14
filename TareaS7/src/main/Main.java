package main;

import main.cliente.Cliente;
import main.empleado.balcon.Balcon;
import main.empleado.cajero.Cajero;
import main.empleado.jefe.Jefe;
import main.util.Fabricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        Cajero cajero = Fabricas.crearCajero();
        Balcon balcon = Fabricas.crearBalcon();
        Jefe jefe = Fabricas.crearJefe();

        int opcion;

        do {
            System.out.println("\n=== BANCO ===");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Ingresar como Cliente");
            System.out.println("3. Ingresar como Cajero");
            System.out.println("4. Ingresar como Balcón");
            System.out.println("5. Ingresar como Jefe");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> registrarCliente();
                case 2 -> menuCliente();
                case 3 -> menuCajero(cajero);
                case 4 -> menuBalcon(balcon);
                case 5 -> menuJefe(jefe);
            }

        } while (opcion != 0);

        System.out.println("Cerrando sistema...");
    }

    // ---------------- MÉTODOS DEL SISTEMA -------------

    private static void registrarCliente() {
        Cliente cliente = Fabricas.crearCliente();
        clientes.add(cliente);
        System.out.println("Cliente registrado correctamente.");
    }

    private static Cliente buscarClientePorCedula() {
        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        for (Cliente c : clientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        System.out.println("Cliente no encontrado.");
        return null;
    }

    // ---------------- MENÚS POR ROL -------------------

    private static void menuCliente() {
        Cliente cliente = buscarClientePorCedula();
        if (cliente == null) return;

        System.out.print("Contraseña: ");
        if (!cliente.ingresarSistema(sc.nextLine())) {
            System.out.println("Contraseña incorrecta.");
            return;
        }

        int op;
        do {
            System.out.println("""
                    \n--- MENÚ CLIENTE ---
                    1. Ver saldo
                    2. Depositar
                    3. Retirar
                    4. Ver resumen financiero
                    0. Salir
                    Opción: """);
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> System.out.println("Saldo: " + cliente.getDinero());
                case 2 -> {
                    System.out.print("Cantidad: ");
                    cliente.setDepositar(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("Retiro: ");
                    cliente.retirarDinero(sc.nextDouble());
                }
                case 4 -> cliente.verResumenFinanciero();
            }

        } while (op != 0);
    }

    private static void menuCajero(Cajero cajero) {
        Cliente cliente = buscarClientePorCedula();
        if (cliente == null) return;

        System.out.print("Cantidad: ");
        double cant = sc.nextDouble();
        sc.nextLine();

        cajero.procesarRetiro(cliente, cant);
        System.out.println("Retiro procesado.");
    }

    private static void menuBalcon(Balcon balcon) {
        Cliente cliente = buscarClientePorCedula();
        if (cliente == null) return;

        System.out.println("Nuevo nombre: ");
        String n = sc.nextLine();

        System.out.println("Nueva cédula: ");
        String c = sc.nextLine();

        System.out.println("Nuevo telefono: ");
        String t = sc.nextLine();

        System.out.println("Nueva tarjeta: ");
        String tar = sc.nextLine();

        balcon.actualizarDatosCliente(cliente, n, c, t, tar);
        System.out.println("Datos actualizados.");
    }

    private static void menuJefe(Jefe jefe) {
        Cliente cliente = buscarClientePorCedula();
        if (cliente == null) return;

        System.out.print("Monto solicitado: ");
        double monto = sc.nextDouble();

        if (jefe.aprobarPrestamo(cliente, monto)) {
            System.out.println("Préstamo aprobado.");
        } else {
            System.out.println("Préstamo denegado.");
        }
    }
}
