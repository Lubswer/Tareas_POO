public class Producto {
    public String nombre;
    public double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    public Producto(){

        //se mantiene null o cero

    }
    public Producto(boolean ninguno){

        this.nombre = "Doritos";
        this.precio = 1.50;
        this.cantidad = 4;
    }
    public void mostrar(){

        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Precio del producto: " + this.precio);
        System.out.println("Cantidad producto: " + this.cantidad);

    }
}
