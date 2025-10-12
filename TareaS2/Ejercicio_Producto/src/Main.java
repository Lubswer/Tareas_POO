
import java.util.Scanner;

public class Main {

    public static Producto ingresoCaracteristicas(Scanner teclado){

        System.out.print("Ingrese el nombre del producto: ");
        String nombreTem = teclado.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precioTem = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese la cantidad de ese producto: ");
        int cantidadTem = teclado.nextInt();
        teclado.nextLine();

        return new Producto(nombreTem, precioTem, cantidadTem);

    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Producto productoAgregado = ingresoCaracteristicas(teclado);

        Producto productoQuemado = new Producto(true);

        Producto productoVacio = new Producto();

        System.out.println();
        productoAgregado.mostrar();
        System.out.println();
        productoQuemado.mostrar();
        System.out.println();
        productoVacio.mostrar();
    }
}