package Ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio4 {
    public static double ingresarPago(Scanner teclado){
        System.out.println("Ingrese la cantidad a pagar: ");
        double cantidad = teclado.nextDouble();
        if(cantidad < 0){
            throw new PagoInvalidoException("El numero es menor a cero!");

        }else if(cantidad > 5000){
            throw new PagoInvalidoException("El pago exede la cifra de 5000$!");

        }else if(cantidad == 0){
            throw new PagoInvalidoException("El pago no puede ser Cero!");
        }else{
            System.out.println("Pago realizado");
            return cantidad;
        }
    }
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        try{
            ingresarPago(teclado);
        }
        catch (PagoInvalidoException pie){
            System.out.println("Error: " + pie.getMessage());
        }
        catch (InputMismatchException ime){
            System.out.println("Error de tipo de dato!");
            teclado.nextLine();
        }
        teclado.close();

    }
}
