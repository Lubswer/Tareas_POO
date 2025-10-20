package datosCancion;

public class Cancion{
    private String titulo;
    private double duracion;
    private int reproducciones;

    public Cancion(String titulo, double duracion, int reproducciones){
        this.titulo = titulo;
        this.duracion = duracion;
        this.reproducciones = reproducciones;
    }
    public Cancion(){
        this.titulo = "Superpowers";
        this.duracion = 2.54;
        this.reproducciones = 95000000;
    }
    public void setReproducir(){

        this.reproducciones += 1;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void mostrarCancion(){
        System.out.println("Titulo de la Cancion: " + this.titulo);
        System.out.println("Duracion de la Cancion: " + ((int)this.duracion) + ":" + (int)(((this.duracion - ((int)this.duracion))) * 100) + " minutos");
        System.out.println("Reproducciones de la Cancion: " + this.reproducciones);
    }
}