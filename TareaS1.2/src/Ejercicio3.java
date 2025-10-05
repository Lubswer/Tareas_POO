import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {

        int numero, limite;
        Scanner leer = new Scanner(System.in);

        System.out.println("// TABLA DE MULTIPLICAR //");
        System.out.print("A continuacion debera ingresar un numero al cual quiera multiplicar: ");
        numero = leer.nextInt();
        leer =  new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Ahora debera ingresar el numero limite donde desea que llegue su numero multiplicado: ");
        limite = leer.nextInt();
        leer.close();

        for(int i = 0; i < limite; i++) {
            System.out.println(numero + " x " + (i + 1) + "   =   " + (numero *(i + 1) ));
        }
    }
}