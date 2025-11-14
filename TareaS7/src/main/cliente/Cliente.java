package main.cliente;

import main.persona.Persona;


public class Cliente extends Persona{

    private String rol;
    private String contrasenia;
    private String targeta;
    private double deudas;
    private boolean registro;
    private double dinero;

    public Cliente(String nombre, String cedula, String telefono, String contrasenia){
        super(nombre,cedula,telefono);
        if (contrasenia == null || contrasenia.isBlank()) {
            throw new IllegalArgumentException("la contraseña no debe estar vacio o contener datos nulos");
        }else{
            this.rol = "Cliente";
            this.contrasenia = contrasenia;
            this.deudas = 0;
            this.registro = false;
            this.targeta = "Sin targeta";
        }
    }
    public boolean ingresarSistema(String contrasenia){
        if(contrasenia.equals(this.contrasenia)){
            return true;
        }else{
            return false;
        }
    }
    public void  solicitarPrestamo(double cantidad){
        if(cantidad < 0){
            this.deudas += cantidad;
        }else{
            System.out.println("Valor incorrecto no se realizo el prestamo");
        }
    }
    public void agregarTargeta(String targeta){
     if(targeta == null || targeta.isBlank()) {
        throw new IllegalArgumentException("la targeta no debe estar vacio o contener datos nulos");
    }else{
         this.targeta = targeta;
     }
    }
    public void registrarCuenta(String condicion){
        if(condicion.equalsIgnoreCase("si")){
            this.registro = true;
            System.out.println("Cuenta registrada correctamente!");
        }else{
            System.out.println("Sin cuanta registrada");
        }
    }
    public void verResumenFinanciero(){
        System.out.println("Deudas: " + deudas);
        System.out.println("Dinero: " + dinero);
    }
    public void mostrarRol(){
        System.out.println("Rol: " + rol);
    }
    public void setDepositar(double dinero){
        if(dinero > 0 ){
            this.dinero = dinero;
        }else{
            System.out.println("Cirfra invalida!");
        }
    }
    public double getDinero(){return this.dinero;}
    public void retirarDinero(double cantidad){
        this.dinero -= cantidad;
    }
    public void cambiarNombre( String nombre){
        setNombre(nombre);
    }
    public void cambiarTelefono( String telefono){
       setTelefono(telefono);
    }
    public void cambiarTargeta(String targeta){
        agregarTargeta(targeta);
    }
    public void cambiarCedula(String cedula){
        setCedula(cedula);
    }

}