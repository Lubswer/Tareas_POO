package main.empleado.balcon;

import main.cliente.Cliente;
import main.empleado.Empleado;


public class Balcon extends Empleado {
    private Cliente cliente;

    public Balcon(String nombre, String cedula, String telefono, String contrasenia, String rol) {
        super(nombre, cedula, telefono, rol, contrasenia);
    }

    public void actualizarDatosCliente(Cliente cliente, String nombre, String cedula, String telefono, String targeta) {
        cliente.setNombre(nombre);
        cliente.cambiarTelefono(telefono);
        cliente.cambiarTargeta(targeta);
        cliente.cambiarCedula(cedula);
    }


    public void mostrarRol() {
        System.out.println("Rol: " + rol);
    }
}
