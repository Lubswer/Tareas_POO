package ejercicio2;

public abstract class Participante {
    private String nombre;
    public Participante(String nombre){
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre vacio o nulo");
        }else{
            this.nombre = nombre;
        }
    }
    public abstract void mostrarTipo();
    public String getNombreParticipante(){return this.nombre;}
}
