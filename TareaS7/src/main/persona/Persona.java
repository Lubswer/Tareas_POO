package main.persona;

public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected String telefono;

    public Persona(String nombre, String cedula, String telefono) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre o error de dato");
        } else if (cedula == null || cedula.isBlank()) {
            throw new IllegalArgumentException("Cédula o error de dato");
        } else if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("Teléfono o error de dato");
        }else{
            this.nombre = nombre;
            this.cedula = cedula;
            this.telefono = telefono;
        }
    }
    public void setNombre(String nombre){
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre o error de dato");
        }else{
            this.nombre = nombre;
        }

    }
    public void setCedula(String cedula){
        if (cedula == null || cedula.isBlank()) {
            throw new IllegalArgumentException("Cedula o error de dato");
        }else{
            this.cedula = cedula;
        }

    }
    public void setTelefono(String telefono){
        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("Telefono o error de dato");
        }else{
            this.telefono = telefono;
        }

    }

    public void actualizarDatos(String nombre, String cedula, String telefono) {
        try {
            setNombre(nombre);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en nombre: " + e.getMessage());
        }

        try {
            setCedula(cedula);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en cédula: " + e.getMessage());
        }

        try {
            setTelefono(telefono);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en teléfono: " + e.getMessage());
        }
    }
    public String getNombre(){ return nombre;}
    public String getCedula(){ return cedula;}
    public String getTelefono(){ return telefono;}
    public abstract void mostrarRol();
}
