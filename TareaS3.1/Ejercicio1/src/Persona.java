public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.profesion = "Sin profesion";
    }
    public void setNombre(String nombre){
        if(nombre.isBlank()) {
            this.nombre = "Sin nombre";
            System.out.println("El nombre no fue agregado porque el campo no ha sido llenado!!");
        }else{
            this.nombre = nombre;
            System.out.println("El nombre fue agregado correctamente!!");
        }
    }
    public void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
            System.out.println("Edad agregado correctamente!!");
        }else{
            if (edad == 0){
                System.out.println("Edad no puede ser cero!!");
            }else{
                System.out.println("Edad no puede un numero negativo!!");
            }
        }
    }
    public void setProfesion(String profesion){
        if(profesion.isBlank()) {
            this.profesion = "Sin profecion";
            System.out.println("La profecion no fue agregado porque el campo no ha sido llenado!!");
        }else{
            this.profesion = profesion;
            System.out.println("La profecion fue agregado correctamente!!");
        }
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getProfesion(){
        return this.profesion;
    }
}
