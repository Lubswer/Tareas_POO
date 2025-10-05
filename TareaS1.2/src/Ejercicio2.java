import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio 2: Números pares

        int cantidad, contador = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros enteros a ingresar: ");
        cantidad = teclado.nextInt();
        teclado = new Scanner(System.in);
        for(int i = 0; i < cantidad; i++){
            int numero;
            System.out.print("Ingrese su numero: " );
            numero = teclado.nextInt();
            teclado = new Scanner(System.in);
            System.out.println(" numero " + (i + 1) + " : " + numero);
            if(numero % 2 == 0){
                contador++;
            }
        }
        teclado.close();
        System.out.println("Se ingresaron " + contador + " numeros pares");

    }
}
