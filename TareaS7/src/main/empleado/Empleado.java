package main.empleado;

import main.persona.Persona;

public abstract class Empleado extends Persona {
    protected String rol;
    protected String contrasenia;
    public Empleado(String nombre, String cedula, String telefono, String contrasenia, String rol){
        super(nombre, cedula, telefono);
        if(rol == null || rol.isBlank()){
            throw new IllegalArgumentException("Campo nulo o vacio");
        }else if( contrasenia == null || contrasenia.isBlank()){
            throw new IllegalArgumentException("Campo nulo o vacio");
        }else{
            this.rol = rol;
            this.contrasenia = contrasenia;
        }
    }

}
