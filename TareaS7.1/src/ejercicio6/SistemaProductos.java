package ejercicio6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaProductos {
    public static Producto crearProducto(Scanner teclado) {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = teclado.nextLine();

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre vacío o nulo");
        }

        System.out.println("Ingrese el precio del producto: ");
        String precioTexto = teclado.nextLine();

        double precio;

        try {
            precio = Double.parseDouble(precioTexto);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Precio inválido, debe ser numérico.");
        }

        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        return new Producto(nombre, precio);
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();
        int opcion = 0;

        do {
            try {
                System.out.println("\n===== SISTEMA DE PRODUCTOS =====");
                System.out.println("1. Registrar producto");
                System.out.println("2. Mostrar productos");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        try {
                            Producto nuevo = crearProducto(teclado);
                            listaProductos.add(nuevo);
                            System.out.println("Producto registrado correctamente!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        if (listaProductos.isEmpty()) {
                            System.out.println("No hay productos registrados todavía.");
                        } else {
                            System.out.println("\n------ LISTA DE PRODUCTOS ------");
                            for (Producto p : listaProductos) {
                                System.out.println("Nombre: " + p.getNombre() + " | Precio: $" + p.getPrecio());
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción fuera del rango permitido.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número para la opción.");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }

        } while (opcion != 3);

        teclado.close();
    }
}
