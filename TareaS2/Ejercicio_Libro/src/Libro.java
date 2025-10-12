import java.util.Scanner;
public class Libro {
    String titulo;
    String autor;
    String genero;
    int anio;

    public Libro(String titulo, String autor, String genero, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
    }

    public void mostrarDatos(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Genero: "+this.genero);
        System.out.println("Anio: "+this.anio);
        System.out.println("Introduciendo datos");
    }


}
