package ec.gob.beca.modelo;
import ec.gob.beca.modelo.SolicitanteBeca;
public class Ejercicio1{
    public static void main(String[] args) {


            SolicitanteBeca solicitante = new SolicitanteBeca(
                    "Juan Pérez",
                    "1723456789",
                    9.2,
                    800.0,
                    true
            );

            System.out.println(solicitante);
            solicitante.generarResultado();
            System.out.println("Horas de estudio recomendadas: "+(int)solicitante.calcularHorasEstudio());
            System.out.println("Horas de estudio con extra 5: "+(int)solicitante.calcularHorasEstudio(5));

        }
}

