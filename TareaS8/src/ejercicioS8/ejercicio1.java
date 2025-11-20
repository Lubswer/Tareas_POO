package ejercicioS8;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio1 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();
        int opcion1 = 0;

        do {
            try {
                System.out.println("========Sistema de Juegos=========");
                System.out.println("1. Registrar Juego");
                System.out.println("2. Mostrar todos los juegos registrados");
                System.out.println("3. Buscar juego por nombre");
                System.out.println("4. Filtrar por tipo de juego");
                System.out.println("5. Salir");
                System.out.print(">> Ingrese una opcion: ");
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion) {
                    case 1:
                        do {
                            System.out.println("1. Juego de Mario Bros");
                            System.out.println("2. Juego de carreras Vehiculos");
                            System.out.println("3. Salir");
                            System.out.print(">> Ingrese una opcion: ");
                            opcion1 = teclado.nextInt();
                            teclado.nextLine();
                            if (opcion1 == 1) {
                                MarioBros nuevoMario = marioBrosJuego(teclado);
                                juegos.add(nuevoMario);
                                System.out.println("Juego registrado!");
                            } else if (opcion1 == 2) {
                                CarreraVehiculos nuevoCarreras = carrerasJuego(teclado);
                                juegos.add(nuevoCarreras);
                                System.out.println("Juego registrado!");
                            } else if (opcion1 == 3) {
                                System.out.println("Saliendo del registro...");
                            } else {
                                throw new IllegalArgumentException("Opción inválida en el Registro");
                            }
                        } while (opcion1 != 3);

                        break;
                    case 2:
                        if (juegos.isEmpty()) {
                            throw new ArrayVacio("Registro vacio, sin juegos registrados");
                        } else {
                            System.out.println("====> Juegos registrados  ");
                            int enumeracion = 1;
                            for (Juego j : juegos) {
                                System.out.println(enumeracion + ". " + j.getNombre());
                                enumeracion += 1;
                            }
                        }
                        break;
                    case 3:
                        if (juegos.isEmpty()) {
                            throw new ArrayVacio("Registro vacio, sin juegos registrados");
                        } else {
                            System.out.print("Ingrese el nombre del juego a buscar: ");
                            String nombreTemp = teclado.nextLine();
                            boolean bandera = true;
                            for (Juego j : juegos) {
                                if (j.getNombre().equalsIgnoreCase(nombreTemp)) {
                                    j.mostrarInformacion();
                                    bandera = false;
                                }
                            }
                            if (bandera) {
                                System.out.println("Juego no encontrado!!");
                            }
                        }
                        break;
                    case 4:
                        if (juegos.isEmpty()) {
                            throw new ArrayVacio("Registro vacio, sin juegos registrados");
                        } else {
                            System.out.println("====> Juegos registrados  ");
                            System.out.println("||| Mario Bros |||");
                            for (Juego j : juegos) {
                                if (j.getTipo().equals("Mario Bros")) {
                                    System.out.println("* " + j.getNombre() + " ---> Tipo: " + j.getTipo());
                                }
                            }
                            System.out.println("||| Carreras|||");
                            for (Juego j : juegos) {
                                if (j.getTipo().equals("Carreras")) {
                                    System.out.println("* " + j.getNombre() + " ---> Tipo: " + j.getTipo());
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        throw new IllegalArgumentException("Opcion del menu Invalida!");
                }


            } catch (InputMismatchException ime) {
                System.out.println("ERROR: No se permiten caracteres de texto aquí.");
                teclado.nextLine();
            } catch (ArrayVacio av) {
                System.out.println("Error: " + av.getMessage());

            } catch (IllegalArgumentException iae) {
                System.out.println("Error: " + iae.getMessage());

            }

        } while (opcion != 5);
    }

    public static CarreraVehiculos carrerasJuego(Scanner teclado) {
        System.out.println("Ingrese el nombre de juego: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la fecha de saluda del juego: ");
        String fecha = teclado.nextLine();
        System.out.println("Ingrese la franquicia de ese juego: ");
        String franquicia = teclado.nextLine();
        return new CarreraVehiculos(nombre, fecha, franquicia, "Carreras");
    }

    public static MarioBros marioBrosJuego(Scanner teclado) {
        System.out.println("Ingrese el nombre de juego: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la fecha de saluda del juego: ");
        String fecha = teclado.nextLine();
        System.out.println("Ingrese la franquicia de ese juego: ");
        String franquicia = teclado.nextLine();
        return new MarioBros(nombre, fecha, franquicia, "Mario Bros");
    }
}
