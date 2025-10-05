import java.util.Scanner;

public class Ejercicio2 {  //Ejercicio 2: Registro de clientes

    public static void main(String[] args) {
        String cedula= " ", nombre= " ", telefono = " ", email = " ";
        Scanner teclado = new Scanner(System.in);
        boolean vacio = false;

        System.out.println("/// REGISTRO ///");


        while (vacio == false) {
            System.out.print("Ingrese su numero de cedula: ");
            cedula = teclado.nextLine();
            teclado = new Scanner(System.in);
            if (cedula.isBlank()) {
                System.out.println("Campo vacio, ingrese nuevamente los datos");
            }else{
                vacio = true;
            }
        }

        while (vacio == true) {
            System.out.print("Ingrese su nombre y apellido: ");
            nombre = teclado.nextLine();
            teclado = new Scanner(System.in);
            if (nombre.isBlank()) {
                System.out.println("Campo vacio, ingrese nuevamente los datos");
            }else{
                vacio = false;
            }
        }
        while (vacio == false) {
            System.out.print("Ingrese su numero de telefono: ");
            telefono = teclado.nextLine();
            teclado = new Scanner(System.in);
            if (telefono.isBlank()) {
                System.out.println("Campo vacio, ingrese nuevamente los datos");
            }else{
                vacio = true;
            }
        }
        while (vacio == true) {
            System.out.print("Ingrese su Email: ");
            email = teclado.nextLine();
            teclado = new Scanner(System.in);
            if (email.isBlank()) {
                System.out.println("Campo vacio, ingrese nuevamente los datos");
            }else{
                vacio = false;
            }
        }
        System.out.println("/// Datos ///|" + " | " + "   Cliente  " );
        System.out.println("Nombre       |" + " | " + nombre);
        System.out.println("Cedula       |" + " | " + cedula);
        System.out.println("Telefono     |" + " | " + telefono);
        System.out.println("Email        |" + " | " + email);
        
    }
}