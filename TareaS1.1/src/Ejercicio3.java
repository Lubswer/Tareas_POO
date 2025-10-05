import java.util.Scanner;

public class Ejercicio3 {  //Ejercicio 3: Requisitos para el cuartel
    static public void main(String args[]) {
        int edad;
        double altura;
        String next = " ";
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("/// Requisitos para el cuartel ///");
            System.out.print("Ingrese su edad:");
            edad = teclado.nextInt();
            System.out.println("");
            teclado = new Scanner(System.in);
            System.out.print("Ingrese su altura (m separado por una coma):");
            altura = teclado.nextDouble();
            System.out.println("");
            teclado = new Scanner(System.in);
            if(edad < 18 || altura < 1.60 ){
                System.out.println("No cumple");
            }else{
                System.out.println("Cumple");
            }

            System.out.print("Desea comprobar otro aspirante (si/no):" );
            next = teclado.next();
        }while(next.equalsIgnoreCase("si"));
        System.out.println("Verificacion Finalizada");
    }
}
