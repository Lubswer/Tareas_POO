package main.empleado.cajero;
import main.cliente.Cliente; // importamos la clase tia
import main.empleado.Empleado;

public class Cajero extends Empleado {
    private Cliente cliente;
    public Cajero(String nombre, String cedula, String telefono, String contrasenia, String rol){
        super(nombre, cedula, telefono,rol,contrasenia);
    }

    public void mostrarRol(){
        System.out.println("Rol: " + rol);
    }
    public void procesarRetiro(Cliente cliente, double cantidad){
        if(cantidad > cliente.getDinero()){
            cliente.retirarDinero(cantidad);
        }
    }
    public void mostrarSaldo(Cliente cliente){
        System.out.println("Saldo = " + cliente.getDinero());
    }

}
