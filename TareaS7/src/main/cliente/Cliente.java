package main.cliente;

import main.persona.Persona;


public class Cliente extends Persona{

    public String rol;
    private String contrasenia;
    private String targeta;
    private double deudas;
    private boolean registro;
    private double dinero;
    private boolean prestamo;

    public Cliente(String nombre, String cedula, String telefono, String contrasenia){
        super(nombre,cedula,telefono);
        if (contrasenia == null || contrasenia.isBlank()) {
            throw new IllegalArgumentException("la contraseña no debe estar vacia o contener datos nulos");
        }else{
            this.rol = "Cliente";
            this.contrasenia = contrasenia;
            this.deudas = 0;
            this.registro = false;
            this.targeta = "Sin targeta";
            this.prestamo = false;
            this.dinero = 0;
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
        if(cantidad > 0){
            System.out.println("Solicitado correctamente");
        }else{
            System.out.println("Valor incorrecto no se realizo el prestamo");
        }
    }
    public void agregarTargeta(String targeta){
     if(targeta == null || targeta.isBlank()) {
        throw new IllegalArgumentException("la targeta no debe estar vacio o contener datos nulos");
    }else{
         this.targeta = targeta;
         System.out.println("Targeta agregada correctamente");
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
        System.out.println("Estado de prestamos: " + prestamo);
    }
    public void mostrarRol(){
        System.out.println("Rol: " + rol);
    }
    public void setDepositar(double dinero){
        if (dinero > 0) {
            this.dinero += dinero;

        }else{
            throw new IllegalArgumentException("Cifra no permitida");
        }
    }
    public double getDinero(){return this.dinero;}
    public void retirarDinero(double cantidad){
        if (cantidad <= this.dinero) {
            this.dinero -= cantidad;

        }else{
            throw new IllegalArgumentException("Cifra no permitida");
        }
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
    public String getContrasenia(){return this.contrasenia;}

}