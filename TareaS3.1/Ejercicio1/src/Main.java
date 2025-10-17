import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Persona persona = new Persona();
        int opcion;

        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        persona.setNombre(nombre);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        persona.setEdad(edad);
        teclado.nextLine();
        System.out.println("Ingrese su profesion: ");
        String profesion = teclado.nextLine();
        persona.setProfesion(profesion);

        if (profesion.isBlank()) {
            System.out.println("Algun dato no fue llenado correctamente");
        } else {
            do {
                System.out.println("Ingrese su opcion: ");
                System.out.println("1.Conocer nombre");
                System.out.println("2.Conocer edad");
                System.out.println("3.Conocer profesion");
                System.out.println("4. Salir");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El nombre es:  " + persona.getNombre());
                        break;
                    case 2:
                        System.out.println("El edad es:  " + persona.getEdad());
                        break;
                    case 3:
                        System.out.println("El profesion es:  " + persona.getProfesion());
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
}