import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edad;
        double altura;
        String palabra;



        System.out.println("Bienvenido a la verificacion de requisitos para entrar en el Equipo");
        do{
            String nombre;
            System.out.print("Ingrese su nombre: ");
            nombre = teclado.nextLine();
            teclado = new Scanner(System.in);
            System.out.print("Ingrese su altura: ");
            altura = teclado.nextDouble();
            teclado = new Scanner(System.in);
            System.out.print("Ingrese su edad: ");
            edad = teclado.nextInt();
            teclado = new Scanner(System.in);
            if(edad < 19 && altura < 1.61){
                System.out.println(nombre + " No comple con la altura ni la edad");
            }else{
                if(edad < 19) {
                    System.out.println(nombre + " No comple con la edad establecida ");
                }else{
                    if(altura < 1.61){
                        System.out.println(nombre + " No comple con la estatura establecida");
                    }else{
                        System.out.println(nombre + " Felicidades ah sido aceptado en el equipo!!");
                    }
                }
            }
            System.out.println(" ");
            System.out.print("Desea continuar con un nuevo registro? (si/no):  ");
            palabra = teclado.next();
            teclado = new Scanner(System.in);

        }while(palabra.equalsIgnoreCase("si"));

    }
}
