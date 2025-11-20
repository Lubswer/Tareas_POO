package ejercicioS8_2;

public class Telefono extends Dispositivo {
    public Telefono(String marca, String modelo, double precio){
        super(marca,modelo,precio);
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + getMarca()
        + "\nModelo: " + getModelo() + "\nPrecio: "
        + getPrecio());
    }
}
