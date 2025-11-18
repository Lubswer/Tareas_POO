package ejercicio2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Atleta> atletas = new ArrayList<>();
        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();

        int opcion = 0;

        do {
            try {
                System.out.println("\n========= Sistema de Olimpiadas =========");
                System.out.println("1. Registrar");
                System.out.println("2. Mostrar registros");
                System.out.println("3. Gestionar eventos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1 -> registrarMenu(teclado, atletas, equipos, eventos);
                    case 2 -> mostrarMenu(atletas, equipos, eventos);
                    case 3 -> menuEventos(teclado, atletas, equipos, eventos);
                    case 4 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción fuera de rango.");
                }

            } catch (InputMismatchException ime) {
                System.out.println("ERROR: Debe ingresar un número.");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 4);
    }

    // ------------------ REGISTRO -----------------------

    public static void registrarMenu(Scanner teclado, ArrayList<Atleta> atletas, ArrayList<Equipo> equipos, ArrayList<Evento> eventos) {
        int opc = 0;

        do {
            try {
                System.out.println("\n--- Registro ---");
                System.out.println("1. Registrar Atleta");
                System.out.println("2. Registrar Equipo");
                System.out.println("3. Registrar Evento");
                System.out.println("4. Volver");
                System.out.print("Elija opción: ");
                opc = teclado.nextInt();

                switch (opc) {
                    case 1 -> {
                        Atleta nuevo = nuevoAtleta(teclado);
                        atletas.add(nuevo);
                        System.out.println("Atleta agregado correctamente!");

                        // Preguntar si pertenece a equipo
                        if (!equipos.isEmpty()) {
                            System.out.print("¿Pertenece a un equipo existente? (si/no): ");
                            teclado.nextLine();
                            String r = teclado.nextLine();

                            if (r.equalsIgnoreCase("si")) {
                                Equipo encontrado = buscarEquipo(teclado, equipos);
                                if (encontrado != null) {
                                    encontrado.registrarAtleta(nuevo);
                                    System.out.println("Atleta asignado al equipo!");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        Equipo nuevo = nuevoEquipo(teclado);
                        equipos.add(nuevo);
                        System.out.println("Equipo registrado correctamente!");
                    }
                    case 3 -> {
                        Evento nuevo = nuevoEvento(teclado);
                        eventos.add(nuevo);
                        System.out.println("Evento registrado correctamente!");
                    }
                }

            } catch (InputMismatchException ime) {
                System.out.println("ERROR: Dato inválido.");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } while (opc != 4);
    }

    // ------------------ MOSTRAR -----------------------

    public static void mostrarMenu(ArrayList<Atleta> atletas, ArrayList<Equipo> equipos, ArrayList<Evento> eventos) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- Mostrar ---");
            System.out.println("1. Mostrar atletas");
            System.out.println("2. Mostrar equipos");
            System.out.println("3. Mostrar eventos");
            System.out.println("4. Volver");
            System.out.print("Opción: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> {
                    if (atletas.isEmpty()) System.out.println("No hay atletas registrados.");
                    else {
                        System.out.println("--- LISTA DE ATLETAS ---");
                        for (Atleta a : atletas) {
                            System.out.println(a.getNombreParticipante() + " | " + a.getPais() + " | " + a.getEdad() + " años | " + a.getGenero());
                        }
                    }
                }
                case 2 -> {
                    if (equipos.isEmpty()) System.out.println("No hay equipos registrados.");
                    else {
                        System.out.println("--- LISTA DE EQUIPOS ---");
                        for (Equipo e : equipos) {
                            System.out.println(e.getNombreParticipante() + " | " + e.getPais() + " | Dueño: " + e.getDuenio());
                        }
                    }
                }
                case 3 -> {
                    if (eventos.isEmpty()) System.out.println("No hay eventos registrados.");
                    else {
                        for (Evento ev : eventos) {
                            System.out.println("Evento: " + ev.getNombreEvento());
                            ev.mostrarParticipantes();
                        }
                    }
                }
            }

        } while (opc != 4);
    }

    // ------------------ EVENTOS -----------------------

    public static void menuEventos(Scanner teclado, ArrayList<Atleta> atletas, ArrayList<Equipo> equipos, ArrayList<Evento> eventos) {
        int opc = 0;

        do {
            System.out.println("\n--- Gestión de Eventos ---");
            System.out.println("1. Agregar participante a evento");
            System.out.println("2. Mostrar participantes de evento");
            System.out.println("3. Volver");
            System.out.print("Opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> agregarParticipanteAEvento(teclado, atletas, equipos, eventos);
                case 2 -> mostrarParticipantesDeEvento(teclado, eventos);
            }

        } while (opc != 3);
    }

    // =====================================================
    // ============= MÉTODOS AUXILIARES ====================
    // =====================================================

    public static Atleta nuevoAtleta(Scanner teclado) {
        teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("País: ");
        String pais = teclado.nextLine();
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Género: ");
        String genero = teclado.nextLine();
        return new Atleta(nombre, pais, edad, genero);
    }

    public static Equipo nuevoEquipo(Scanner teclado) {
        teclado.nextLine();
        System.out.print("Nombre del Equipo: ");
        String nombre = teclado.nextLine();
        System.out.print("País: ");
        String pais = teclado.nextLine();
        System.out.print("Dueño: ");
        String duenio = teclado.nextLine();
        System.out.print("Cantidad de atletas permitidos: ");
        int cant = teclado.nextInt();
        return new Equipo(nombre, pais, duenio, cant);
    }

    public static Evento nuevoEvento(Scanner teclado) {
        teclado.nextLine();
        System.out.print("Nombre del evento: ");
        String n = teclado.nextLine();
        System.out.print("Tipo de evento: ");
        String t = teclado.nextLine();
        System.out.print("Fecha: ");
        String f = teclado.nextLine();
        return new Evento(n, t, f);
    }

    public static Equipo buscarEquipo(Scanner teclado, ArrayList<Equipo> equipos) {
        System.out.println("Lista de equipos disponibles:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombreParticipante());
        }
        System.out.print("Seleccione número de equipo: ");
        int num = teclado.nextInt();
        return (num > 0 && num <= equipos.size()) ? equipos.get(num - 1) : null;
    }

    public static Evento buscarEvento(Scanner teclado, ArrayList<Evento> eventos) {
        System.out.println("Lista de eventos:");
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println((i + 1) + ". " + eventos.get(i).getNombreEvento());
        }
        System.out.print("Seleccione número de evento: ");
        int num = teclado.nextInt();
        return (num > 0 && num <= eventos.size()) ? eventos.get(num - 1) : null;
    }

    public static void agregarParticipanteAEvento(Scanner teclado, ArrayList<Atleta> atletas, ArrayList<Equipo> equipos, ArrayList<Evento> eventos) {
        Evento ev = buscarEvento(teclado, eventos);
        if (ev == null) return;

        System.out.println("¿Qué desea agregar?");
        System.out.println("1. Atleta");
        System.out.println("2. Equipo");
        System.out.print("Elija: ");
        int op = teclado.nextInt();

        if (op == 1) {
            if (atletas.isEmpty()) System.out.println("No hay atletas registrados.");
            else {
                Atleta at = buscarAtleta(teclado, atletas);
                if (at != null) ev.agregarParticipante(at);
            }
        } else if (op == 2) {
            if (equipos.isEmpty()) System.out.println("No hay equipos registrados.");
            else {
                Equipo eq = buscarEquipo(teclado, equipos);
                if (eq != null) ev.agregarParticipante(eq);
            }
        }
    }

    public static Atleta buscarAtleta(Scanner teclado, ArrayList<Atleta> atletas) {
        System.out.println("Lista de atletas:");
        for (int i = 0; i < atletas.size(); i++) {
            System.out.println((i + 1) + ". " + atletas.get(i).getNombreParticipante());
        }
        System.out.print("Seleccione número de atleta: ");
        int num = teclado.nextInt();
        return (num > 0 && num <= atletas.size()) ? atletas.get(num - 1) : null;
    }

    public static void mostrarParticipantesDeEvento(Scanner teclado, ArrayList<Evento> eventos) {
        Evento ev = buscarEvento(teclado, eventos);
        if (ev != null) ev.mostrarParticipantes();
    }
}
