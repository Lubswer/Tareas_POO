package ejercicioS8_2;

public abstract class  Dispositivo {
    private String marca;
    private String modelo;
    private double precio;
    public Dispositivo(String marca, String modelo, double precio){
        if(marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca vacia o nula");
        } else if(modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Modelo vacio o nulo");
        } else if(precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public abstract void mostrarInfo();
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public double getPrecio(){return this.precio;}

    public void setMarca(String marca){
        if(marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca vacia o nula");
        }else{
            this.marca = marca;
        }
    }
    public void setModelo(String modelo){
        if(modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Modelo vacio o nulo");
        }else{
            this.modelo = modelo;
        }
    }
    public void setPrecio(double cantidad){
        if(cantidad < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }else{
            this.precio = cantidad;
        }
    }


}
