

import java.util.Scanner;

public class Main {

    public static Libro ingresoLibro(Scanner teclado){

            System.out.println("Introduce el titulo");
            String titulo = teclado.nextLine();
            System.out.println("Introduce el autor");
            String autor = teclado.nextLine();
            System.out.println("Introduce el genero");
            String genero = teclado.nextLine();
            System.out.println("Introduce el año de publicacion");
            int anio = teclado.nextInt();
            teclado.nextLine();


        return new Libro(titulo, autor, genero,anio);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Libro1: ");

        Libro primerLibro = ingresoLibro(teclado);
        System.out.println("Libro2: ");
        Libro segundoLibro = ingresoLibro(teclado);

        primerLibro.mostrarDatos();
        segundoLibro.mostrarDatos();

    }
}