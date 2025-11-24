import ejercicio5.DatosInvalidosException;

public class CandidataEstudiante extends Candidata {
    private String universidad;
    private String carrera;
    public CandidataEstudiante(int id, String nombre, String apellido, int edad, String distrito, double puntajeJurado,String universidad, String carrera){
        super(id,nombre,apellido,edad,distrito,puntajeJurado);
        if(universidad == null || universidad.isBlank()){
            throw new DatosInvalidosException("UNiversidad vacio o nula!");
        }else if(carrera == null || carrera.isBlank()){
            throw new DatosInvalidosException("Carrera vacia o nula!");
        }else{
            this.universidad = universidad;
            this.carrera = carrera;
        }
    }
    public void mostrarDetalles(){
        System.out.println("Id: " + getId() +
        "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nDistrito: " + getDistrito() +
                "\nPuntaje: " + getPuntajeJurado() +
                "\nUniversidad: " + this.universidad +
                "\nCarrera: " + this.carrera);
    }
    public void setUniversidad(String nuevo){
        if(nuevo == null || nuevo.isBlank()){
            throw new DatosInvalidosException("UNiversidad vacio o nula!");
        }else{
            this.universidad = nuevo;
        }
    }
    public void setCarrera(String nuevo){
        if(nuevo == null || nuevo.isBlank()){
            throw new DatosInvalidosException("Carrera vacia o nula!");
        }else{
            this.carrera = nuevo;
        }
    }
}
