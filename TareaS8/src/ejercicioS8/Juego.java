package ejercicioS8;

public abstract class Juego {
    private String nombre;
    private String fechaSalida;
    private String franquicia;

    public Juego(String nombre, String fechaSalida,String franquicia){
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre del juego vacio o nulo");

        }else if(fechaSalida == null || fechaSalida.isBlank()){
            throw new IllegalArgumentException("Fecha de salida vacia o nula");

        }else if(franquicia == null || franquicia.isBlank()){
            throw new IllegalArgumentException("Franquicia nula o vacia");
        }else{
            this.nombre = nombre;
            this.fechaSalida = fechaSalida;
            this.franquicia = franquicia;
        }
    }
    public String getNombre(){return this.nombre;}
    public String getFechaSalida(){return this.fechaSalida;}
    public String getFranquicia(){return this.franquicia;}
    public abstract void mostrarInformacion();
    public abstract String getTipo();
}
