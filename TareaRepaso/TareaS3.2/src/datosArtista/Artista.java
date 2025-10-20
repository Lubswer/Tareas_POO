package datosArtista;

public class Artista{
    private String nombre;
    private String genero;
    private int seguidores;

    public Artista(String nombre, String genero, int seguidores){
        this.nombre = nombre;
        this.genero = genero;
        this.seguidores = seguidores;

    }
    public Artista(){
        this.nombre = "Daniel Caesar";
        this.genero = "Pop";
        this.seguidores = 2460000;

    }
    public void setGanarSeguidores(int seguidores){
        if(seguidores >0){
            this.seguidores += seguidores;
            System.out.println("Nuemero de seguidores aumentado correctamente!");
        }else if(seguidores < 0 ){
            System.out.println("No se pudo aumentar los seguidores, recuerde introducir valores positivos!");

        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public void mostrarPerfil(){
        System.out.println("Nombre del artista: " + this.nombre);
        System.out.println("Genero musical: " + this.genero);
        System.out.println("Seguidores: " + this.seguidores);
    }
}