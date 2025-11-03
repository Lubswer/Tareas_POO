import ec.gob.subsidio.modelo.SolicitanteSubsidio;

import java.util.Scanner;

import static ec.gob.subsidio.modelo.SolicitanteSubsidio.calcularConsumoMensual;

public class main {

    public static void Requisitos(){
        System.out.println("- Tener ingresos mensuales menores o iguales a $1,200.\n" +
                "- No poseer más de un vehículo registrado.\n" +
                "- Tener residencia en Ecuador (no aplica para residentes en el extranjero).\n");
    }


    public static void main(String[] args){
        Requisitos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su cedula: ");
        String cedula = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Ingrese sus ingresos mensuales: ");
        double ingresos = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de vehiculos registrados: ");
        int cantidad = teclado.nextInt();
        System.out.println("¿Vive en Ecuador? (true/false): ");
        boolean vive = teclado.nextBoolean();

        SolicitanteSubsidio nuevo = new SolicitanteSubsidio(nombre, cedula,ingresos,cantidad,vive);
        System.out.println(nuevo.toString());
        System.out.println("========= Resultado evaluacion ========");
        System.out.println("Subsidio: " + nuevo.getGenerarResultado());

        System.out.println("======= Calculo Mensual =======");
        System.out.println("Al mes si reocrreo 40k necesita : " + calcularConsumoMensual());
        System.out.println("Al mes si los kilometro son 80 : " + calcularConsumoMensual(80.00));
    }
}
