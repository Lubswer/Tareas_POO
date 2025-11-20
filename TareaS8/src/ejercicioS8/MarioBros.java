package ejercicioS8;

public class MarioBros extends Juego {
    private String tipo;
    public MarioBros(String nombre, String fechaSalida,String franquicia, String tipo){
        super(nombre,fechaSalida,franquicia);
        this.tipo = tipo;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre()+ "\nFecha de salida: " + getFechaSalida()
        + "\nFranquicia: " + getFranquicia() + "Juego de: " + this.tipo);
    }
    public String getTipo(){return this.tipo;}
}
