import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Producto nuevo = new Producto();
        do {
            System.out.println("//Ingrese una opcion//");
            System.out.println("1. Cambiar nombre del producto");
            System.out.println("2. Cambiar precio del producto");
            System.out.println("3. Ver datos del proucto");
            System.out.println("4. Salir del programa");
            opcion = teclado.nextInt();
            teclado = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = teclado.nextLine();
                    nuevo.setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el precio del producto: ");
                    double precio = teclado.nextDouble();
                    nuevo.setPrecio(precio);
                    break;
                case 3:
                    System.out.println("////DATOS DEL PRODUCTO////");
                    if(nuevo.getnombre().equals("No definido")){
                        System.out.println("No existe el nombre del producto");
                    }else{
                        System.out.println("El nombre del producto es " + nuevo.getnombre());
                    }
                    if(nuevo.getprecio() == 0.0){
                        System.out.println("No existe el precio del producto");
                    }else {
                        System.out.println("El precio del producto es " + nuevo.getprecio());
                    }

                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");


            }

        } while (opcion != 4);

    }
}