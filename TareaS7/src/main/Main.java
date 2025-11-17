package main;
import main.empleado.cajero.Cajero;
import main.cliente.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Cajero> cajeros = new ArrayList<>();
        do {
            System.out.println("====== Sistema Bancario ======");
            System.out.println(">>> Elija una opcion");
            System.out.println("1.Registro de Cliente\n2.Ingresar como cliente\n3.Ingresar como empleado(cajero,balcón,jefe)");
            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    try {
                        Cliente nuevo = Fabricas.crearCliente(teclado);
                        clientes.add(nuevo);
                        System.out.println("Creado con exito!!");
                    } catch (Exception e) {
                        System.out.println("Revisar que todos los campos sean llenados correctamente!!");
                        System.out.println("✗ Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    int opcionCliente = 0;
                    boolean ingreso = true;
                    String cedula = " ";
                    String contrasenia = " ";
                    do {
                        System.out.println("Ingrese su numero de cedula : ");
                        cedula = teclado.nextLine();
                        System.out.println("Ingrese su contraseña: ");
                        contrasenia = teclado.nextLine();
                        teclado.nextLine();

                        for (Cliente c : clientes) {
                            if (c.getCedula().equals(cedula) && c.getContrasenia().equals(contrasenia)) {
                                try {
                                    System.out.println("Elija una opcion:");
                                    System.out.println("1.Solicitar prestamo");
                                    System.out.println("2.Agregar Targata");
                                    System.out.println("3.Ver resumen financiero");
                                    System.out.println("4.Salir");
                                    opcionCliente = teclado.nextInt();

                                    if (opcionCliente == 1) {
                                        System.out.println("Ingrese la cantidad a solicitar: ");
                                        double cantidad = teclado.nextDouble();
                                        c.solicitarPrestamo(cantidad);
                                    } else if (opcionCliente == 2) {
                                        System.out.println("Ingrese el numero de Targeta: ");
                                        String targeta = teclado.nextLine();
                                        c.agregarTargeta(targeta);
                                    } else if (opcionCliente == 3) {
                                        c.verResumenFinanciero();
                                    } else if (opcionCliente == 4) {
                                        System.out.println("Saliendo...");
                                    } else {
                                        throw new IllegalArgumentException("Ingreso de digito indebido!");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                    opcionCliente = 4;
                                }

                            } else {
                                System.out.println("Datos invalidos");
                                opcionCliente = 4;
                            }
                        }

                    } while (opcionCliente != 4);
                    break;
                case 3:
                    int opcionEmpleado = 0;
                    int opcionAcceso1 = 0;
                    do {
                        try{
                            System.out.println(">>> Seleccione el tipo de empleado");
                            System.out.println("1.Cajero\n2.Balcón\n3.Jefe\n4.Salir\nIngrese una opcion:");
                            opcionEmpleado  = teclado.nextInt();
                            teclado.nextLine();
                            if (opcionEmpleado  == 1) {
                                try {
                                    System.out.println("Elija una opcion");
                                    System.out.println("1.Ingresar como invitado\n2.Ingresar como Empleado registrado\n3.Salir");
                                    opcionAcceso1 = teclado.nextInt();
                                    teclado.nextLine();
                                    if (opcionAcceso1 == 1 || opcionAcceso1 == 2) {
                                        Cajero nuevoCajero = new Cajero("Invitado", "root", "0000000000", "root", "Cajero");
                                        cajeros.add(nuevoCajero);
                                        System.out.println(">> Credenciales del Cajero");
                                        System.out.println("Cedula: ");
                                        String cedulaC = teclado.nextLine();
                                        System.out.println("Contraseña: ");
                                        String contraseniaC = teclado.nextLine();
                                        for (Cajero ca : cajeros) {
                                            if (ca.getCedulaC().equals(cedulaC) && ca.getContraseniaC().equals(contraseniaC)) {
                                                if (clientes.isEmpty()) {
                                                    System.out.println("✗ No hay clientes registrados");
                                                } else {
                                                    System.out.print("Ingrese la cédula del cliente: ");
                                                    String cedulaCliente = teclado.nextLine();

                                                    boolean clienteEncontrado = false;

                                                    for (Cliente c : clientes) {
                                                        if (c.getCedula().equals(cedulaCliente)) {
                                                            clienteEncontrado = true;

                                                            // Menú de operaciones
                                                            System.out.println("Elija una opción para el cliente:");
                                                            System.out.println("1. Retirar Dinero");
                                                            System.out.println("2. Depositar dinero");
                                                            System.out.println("3. Salir");

                                                            int opcion_opcion1_Acceso1 = teclado.nextInt();
                                                            teclado.nextLine();

                                                            switch (opcion_opcion1_Acceso1) {
                                                                case 1:
                                                                    System.out.print("Cantidad a retirar: $");
                                                                    double cantidadRetiro = teclado.nextDouble();
                                                                    teclado.nextLine();
                                                                    c.retirarDinero(cantidadRetiro);
                                                                    break;

                                                                case 2:
                                                                    System.out.print("Cantidad a depositar: $");
                                                                    double cantidadDeposito = teclado.nextDouble();
                                                                    teclado.nextLine();
                                                                    c.setDepositar(cantidadDeposito);
                                                                    break;

                                                                case 3:
                                                                    System.out.println("Saliendo...");
                                                                    break;

                                                                default:
                                                                    System.out.println("✗ Opción inválida");
                                                            }
                                                            break;
                                                        }
                                                    }

                                                    if (!clienteEncontrado) {
                                                        System.out.println("✗ Cédula no encontrada");
                                                    }
                                                }

                                            } else {
                                                System.out.println("Datos invalidos");
                                            }
                                        }
                                    }else{
                                        System.out.println("Saliendo de cajeros...");
                                    }
                                }catch (IllegalArgumentException e){
                                    System.out.println("Error: " + e.getMessage());
                                    opcionEmpleado = 4;
                                }catch (Exception e){
                                    System.out.println("Caracter invalido");
                                }
                            }
                        }catch (Exception e){
                            System.out.println("Error: " + e.getMessage());
                            teclado.nextLine();
                            opcionEmpleado = 4;
                        }


                    }while(opcionEmpleado != 4);

            }

        } while (opcion != 4);

    }
}
