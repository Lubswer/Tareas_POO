package ejercicio5;

public class Producto {
    private String codigo;
    private String nombre;
    private double precioBase;
    public Producto(String codigo, String nombre, double precioBase){
        if(codigo ==  null || codigo.isBlank()){
            throw new IllegalArgumentException("Codigo Vacio o nulo! ");
        }else if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre Vacio o nulo!");
        }else if(precioBase < 0){
            throw new IllegalArgumentException("Precio menor a cero!");
        }else{
            this.codigo = codigo;
            this.nombre = nombre;
            this.precioBase = precioBase;
        }
    }
    public void agregarNumero(int contador){
        this.codigo = this.codigo + contador;
    }
    public String getNombre(){ return this.nombre; }
    public double getPrecioBase(){ return this.precioBase; }

    public String getCodigo() {
        return this.codigo;
    }
}
