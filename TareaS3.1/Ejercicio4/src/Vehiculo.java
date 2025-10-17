public class Vehiculo {
    public String marca;
    private String modelo;
    private String velocidadMaxima;
    private String codigoSeguridad;
    private String color;

    public Vehiculo(String marca, String modelo, String velocidadMaxima, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
        System.out.println("Nuevo modelo actualizado con exito!");

    }

    public String getModelo() {
        return modelo;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
        System.out.println("Codigo de suguridad actualizado con exito!");

    }

    public void setColor(String color) {

        if (color.equalsIgnoreCase("rojo")) {
            this.color = "rojo";
            System.out.println("Color actualizado con exito!");
        } else {
            if (color.equalsIgnoreCase("azul")) {
                this.color = "azul";
                System.out.println("Color actualizado con exito!");
            } else {
                if (color.equalsIgnoreCase("blanco")) {
                    this.color = "blanco";
                    System.out.println("Color actualizado con exito!");
                } else {
                    System.out.println("Ese color no es valido!");
                }
            }
        }

    }
    public String getColor() {
        return color;
    }
}
