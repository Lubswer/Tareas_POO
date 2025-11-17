package Ejercicio3;

public class Estudiante {
    private String estudiante;
    private int edad;
    public Estudiante(String estudiante, int edad){
        if (estudiante == null || estudiante.isBlank()){
            throw new IllegalArgumentException("No puede ser nulo o vacio");
        }else if (edad <= 0 || edad >120){
            throw new IllegalArgumentException("La edad mo puede ser negativa o ser mayor a 120");
        }else{
            this.edad = edad;
            this.estudiante = estudiante;
        }
    }
}
