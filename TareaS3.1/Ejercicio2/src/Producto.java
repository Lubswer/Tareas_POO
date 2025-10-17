class Producto {
    private double precio;
    private String nombre;

    public Producto() {
        this.precio = 0.0;
        this.nombre = "No definido";
    }

    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
            System.out.println("Precio añadido correctamente!!");
        }else{
            if(precio == 0.0){
                System.out.println("No puede poner un precio igual a cero!!");
            }else{
                System.out.println("Precio negativo, no se puede agregar!!");
            }
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre agregado correctamente!!");
    }

    public String getnombre() {
        return nombre;
    }
    public double getprecio() {
        return precio;
    }
}
