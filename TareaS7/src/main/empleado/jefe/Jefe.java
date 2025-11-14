package main.empleado.jefe;

import main.cliente.Cliente;
import main.empleado.Empleado;


public class Jefe extends Empleado {
    private Cliente cliente;
    public Jefe(String nombre, String cedula, String telefono, String contrasenia, String rol) {
        super(nombre, cedula, telefono, rol, contrasenia);

    }
    public void mostrarRol(){
        System.out.println("Rol: " + rol);
    }
    public boolean aprobarPrestamo(Cliente cliente, double monto){
        if(cliente.getDinero() > monto){
            return  true;
        }else{
            return false;
        }

    }

}