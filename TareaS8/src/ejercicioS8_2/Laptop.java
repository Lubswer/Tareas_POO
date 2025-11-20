package ejercicioS8_2;
public class Laptop extends Dispositivo {
    public Laptop(String marca, String modelo, double precio){
        super(marca,modelo,precio);
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + getMarca()
                + "\nModelo: " + getModelo() + "\nPrecio: "
                + getPrecio());
    }
}
