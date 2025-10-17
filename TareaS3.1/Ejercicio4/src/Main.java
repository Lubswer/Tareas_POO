import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Vehiculo vehiculo = new Vehiculo("Toyota", "TruenoAE86", "100 km por hora", "Blanco");
        do {
            System.out.println("// MENU DEL VEHICULO //");
            System.out.println("1. Cambiar el modelo");
            System.out.println("2. Cambiar el color");
            System.out.println("3. Cambiar el codigo de seguridad");
            System.out.println("4. Mostrar las especificaciones del vehiculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("El nuevo modelo: ");
                    String Nmodelo = teclado.nextLine();
                    vehiculo.setModelo(Nmodelo);
                    break;
                case 2:
                    System.out.println("El nuevo color: ");
                    String Ncolor = teclado.nextLine();
                    vehiculo.setColor(Ncolor);
                    break;
                case 3:
                    System.out.println("El nuevo codigo de seguridad: ");
                    String Ncodigo = teclado.nextLine();
                    vehiculo.setCodigoSeguridad(Ncodigo);
                    break;
                case 4:
                    System.out.println("Marca: " + vehiculo.marca);
                    System.out.println("Modelo: " + vehiculo.getModelo());
                    System.out.println("Color: " + vehiculo.getColor());
                    System.out.println("Velocidad Máxima: " + vehiculo.getVelocidadMaxima());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 5);

    }
}