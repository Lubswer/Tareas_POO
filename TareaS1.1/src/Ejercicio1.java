import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio1 {    //Ejercicio 1: Registro de inventarios de plásticos
    public static void main(String[] args) {

        int cantidad;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("// Registro de inventario para productos plasticos //");

        System.out.print("Ingrese la cantidad de productos que desea registrar: ");
        cantidad = teclado.nextInt();
        teclado = new Scanner(System.in);

        String[] productos = new String[cantidad];
        double[] precios = new double[cantidad];
        int[] cantidadesTotales = new int[cantidad];



        for(int i = 0; i < productos.length; i++){
            String producto;
            double precioUnitario;
            int cantidadProducto;
            System.out.print("Ingrese el nombre del producto  " + (i+1) + " :" );
            producto = teclado.next();
            productos[i] = producto;
            teclado = new Scanner(System.in);
            System.out.print("Ingrese su precio unitario con coma: ");
            precioUnitario = teclado.nextDouble();
            teclado = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de ese producto: ");
            cantidadProducto = teclado.nextInt();
            teclado = new Scanner(System.in);
            precios[i] = cantidadProducto * precioUnitario;
            cantidadesTotales[i] = cantidadProducto;

        }
        System.out.println("Productos en stock: " );

        for(int i = 0; i < productos.length; i++){
            System.out.println( productos[i] + "   |  Cantidad: " + cantidadesTotales[i]
                    + " | Precio del total en Stock: " + df.format(precios[i]) +  " | Precio unitario:   " + df.format(precios[i] / cantidadesTotales[i]));
        }
    }
}
