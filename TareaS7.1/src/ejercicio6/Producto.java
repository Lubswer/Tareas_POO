package ejercicio6;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre vacío o nulo");
        } else if (precio < 0) {
            throw new IllegalArgumentException("Precio negativo");
        } else {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    public String getNombre() { return this.nombre; }
    public double getPrecio() { return this.precio; }
}
