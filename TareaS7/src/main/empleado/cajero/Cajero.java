package main.empleado.cajero;
import main.cliente.Cliente; // importamos la clase tia
import main.empleado.Empleado;

public class Cajero extends Empleado {
    private Cliente cliente;
    public Cajero(String nombre, String cedula, String telefono, String contrasenia, String rol){
        super(nombre, cedula, telefono,contrasenia,rol);
    }

    public void mostrarRol(){
        System.out.println("Rol: " + rol);
    }
    public void procesarRetiro(Cliente cliente, double cantidad){
        if(cantidad > cliente.getDinero()){
            try{
                cliente.retirarDinero(cantidad);
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
    public void mostrarSaldo(Cliente cliente){
        System.out.println("Saldo = " + cliente.getDinero());
    }
    public String getContraseniaC(){
        return this.contrasenia;
    }
    public String getCedulaC(){
        return this.cedula;
    }

}
