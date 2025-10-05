import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int Nestudiantes,Nnotas;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingreese el numero de Estudiantes:");
        Nestudiantes = teclado.nextInt();
        teclado = new Scanner(System.in);

        System.out.println("Ingreese el numero de Notas:");
        Nnotas = teclado.nextInt();
        teclado = new Scanner(System.in);

        String datos[][] = new String[Nestudiantes][Nnotas + 1];

        for(int i=0;i<datos.length;i++){
            System.out.println("Ingreese el nombre del estudiante " + (i+1) + " :");
            datos[i][0] = teclado.next();
            for(int j=1;j<datos[0].length;j++){
                System.out.println("Ingreese el nota " + (j ) + " :");
                datos[i][j] = teclado.next();
            }
        }
        for(int i=0;i<datos.length;i++){
            System.out.print("Estudiante " + datos[i][0] + "  --> ");
            double nota = 0;
            for(int j=1;j<datos[0].length;j++){
                System.out.print(" Nota" + j + " fue: "+ datos[i][j] + "  ,");
                nota += Double.parseDouble(datos[i][j]);
            }
            if(nota/(datos[0].length - 1) < 7){
                System.out.println("/// No aprueba Necesita tener un promedio mayor igual a 7 ///");
            }else{
                System.out.println("/// Aprueba felicidades ///");
            }
        }





    }
}
