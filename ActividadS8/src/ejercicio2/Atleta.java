package ejercicio2;

public class Atleta extends Participante {
    private String pais;
    private int edad;
    private String genero;

    public Atleta(String nombre, String pais, int edad, String genero){
        super(nombre);
        if(pais == null || pais.isBlank()){
            throw new IllegalArgumentException("Pais vacio o nulo");
        }else if(edad <= 0 ){
            throw new IllegalArgumentException("Edad menor a cero");
        }else if(genero == null || genero.isBlank()){
            throw new IllegalArgumentException("Genero vacio o nulo");
        }else{
            this.pais = pais;
            this.edad = edad;
            this.genero = genero;
        }
    }

    public void mostrarTipo(){
        System.out.println("Tipo: Atleta");
    }

    // === GETTERS ===
    public String getPais() { return pais; }

    public int getEdad() { return edad; }

    public String getGenero() { return genero; }
}
