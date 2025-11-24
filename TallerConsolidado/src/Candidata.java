
public abstract class Candidata {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String distrito;
    private double puntajeJurado;

    public Candidata(int id, String nombre, String apellido, int edad, String distrito, double puntajeJurado) {
        if (id <= 0) {
            throw new DatoInvalidoException("El id del candidato menor igual  a 0");
        } else if (nombre == null || nombre.isBlank()) {
            throw new DatoInvalidoException("Nombre vacio o nulo");
        } else if (apellido == null || apellido.isBlank()) {
        } else if (edad <= 0) {
            throw new DatoInvalidoException("El edad es menor igual a 0");
        } else if (distrito == null || distrito.isBlank()) {
            throw new DatoInvalidoException("El distrito vacio o nulo");
        } else if (puntajeJurado < 0) {
            throw new DatoInvalidoException("El puntaje es menor a 0");
        } else {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.distrito = distrito;
            this.puntajeJurado = puntajeJurado;
        }
    }
    public abstract void mostrarDetalles();
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public String getDistrito() { return distrito; }
    public double getPuntajeJurado() { return puntajeJurado; }

    public void setId(int nuevo){
        if(nuevo <= 0){
            throw new DatoInvalidoException("El id del candidato menor igual  a 0");
        }else{
            this.id = nuevo;
        }
    }
    public void setNombre(String nuevo){
        if (nuevo == null || nuevo.isBlank()) {
            throw new DatoInvalidoException("Nombre vacio o nulo");
        } else{
            this.nombre = nuevo;
        }
    }
    public void setApellido(String nuevo){
        if (apellido == null || apellido.isBlank()) {
            throw new DatoInvalidoException("Apellido vacio o nulo");
        } else{
            this.apellido = nuevo;
        }
    }
    public void setEdad(int nuevo){
        if(edad <= 0){
            throw new DatoInvalidoException("La edad del candidato menor igual  a 0");
        }else{
            this.edad = nuevo;
        }
    }
    public void setPuntajeJurado(int nuevo){
        if(nuevo < 0){
            throw new DatoInvalidoException("El puntaje no puede ser negativo");
        }else{
            this.puntajeJurado = nuevo;
        }
    }
    public void setDistrito(String nuevo){
        if (distrito == null || distrito.isBlank()) {
            throw new DatoInvalidoException("Distrito vacio o nulo");
        } else{
            this.distrito  = nuevo;
        }
    }



}