package ejercicio2;
import java.util.ArrayList;

public class Equipo extends Participante {
    private String pais;
    private String duenio;
    private int cantidadAtletasInscritos;
    private ArrayList<Atleta> atletas = new ArrayList<>();

    public Equipo (String nombre, String pais, String duenio, int cantidadAtletasInscritos){
        super(nombre);
        if(pais == null || pais.isBlank()){
            throw new IllegalArgumentException("Pais vacio o nulo");
        }else if(duenio == null || duenio.isBlank()){
            throw new IllegalArgumentException("Nombre del Dueño vacio o nulo");
        }else if(cantidadAtletasInscritos <= 0){
            throw new IllegalArgumentException("Digito de inscritos no permitido");
        }else{
            this.duenio = duenio;
            this.pais = pais;
            this.cantidadAtletasInscritos = cantidadAtletasInscritos;
        }
    }

    public void mostrarTipo(){
        System.out.println("Tipo: Equipo");
    }

    public void registrarAtleta(Atleta nuevo){
        this.atletas.add(nuevo);
        System.out.println("Atleta registrado en el equipo");
    }

    // === GETTERS ===
    public String getPais() { return pais; }

    public String getDuenio() { return duenio; }

    public int getCantidadAtletasInscritos() { return cantidadAtletasInscritos; }

    public ArrayList<Atleta> getAtletas() { return atletas; }
}
