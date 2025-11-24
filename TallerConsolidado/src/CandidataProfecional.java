import ejercicio5.DatosInvalidosException;

public class CandidataProfecional extends Candidata{
    private String profesion;
    private int experiencia;
    public CandidataProfecional(int id, String nombre, String apellido, int edad, String distrito, double puntajeJurado,String profesion, int experiencia){
        super(id,nombre,apellido,edad,distrito,puntajeJurado);
        if(profesion == null || profesion.isBlank()){
            throw new DatosInvalidosException("Universidad vacio o nula!");
        }else if(experiencia < 0){
            throw new DatosInvalidosException("Los años de experiencia no deben ser negativos!!");
        }else{
            this.profesion = profesion;
            this.experiencia = experiencia;
        }
    }
    public void mostrarDetalles(){
        System.out.println("Id: " + getId() +
                "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nDistrito: " + getDistrito() +
                "\nPuntaje: " + getPuntajeJurado() +
                "\nProfecion: " + this.profesion +
                "\nExperiencia: " + this.experiencia);
    }
}
