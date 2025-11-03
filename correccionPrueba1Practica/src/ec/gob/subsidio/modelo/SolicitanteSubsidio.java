package ec.gob.subsidio.modelo;

import ec.gob.beca.modelo.SolicitanteBeca;

import java.lang.invoke.StringConcatException;

public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        setNombreCompleto(nombreCompleto);
        setCedula(cedula);
        setIngresos(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }

    public void setNombreCompleto(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombreCompleto = nombre;
        } else {
            System.out.println("Nombre Invalido se agregó un valor por defecto");
            this.nombreCompleto = "Sin nombre";
        }
    }

    public void setCedula(String cedula) {
        if (cedula != null && !cedula.isBlank() && cedula.length() == 10) {
            this.cedula = cedula;
        } else {
            System.out.println("Cedula Invalida se agregó un valor por defecto");
            this.cedula = "0000000000";
        }
    }

    public void setIngresos(double ingresos) {
        if (ingresos >= 470) {
            this.ingresosMensuales = ingresos;
        } else {
            System.out.println("Ingresos Invalidos se agregó un valor por defecto");
            this.ingresosMensuales = 0.00;
        }
    }

    public void setCantidadVehiculos(int cantidad) {
        if (cantidad >= 0) {
            this.cantidadVehiculos = cantidad;
        } else {
            System.out.println("Cantidad Invalida se agregó un valor por defecto");
            this.cantidadVehiculos = 0;
        }
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public String getCedula() {
        return this.cedula;
    }

    public double getIngresos() {
        return this.ingresosMensuales;
    }

    public int getVehiculos() {
        return this.cantidadVehiculos;
    }

    public boolean getPais() {
        return this.viveEnEcuador;
    }

    public boolean subsidioAprobado() {
        if (this.ingresosMensuales <= 1200 && this.cantidadVehiculos <= 1 && (this.viveEnEcuador == true)) {
            return true;
        }else{
            return false;
        }
    }
    public String getGenerarResultado(){
        if(subsidioAprobado()){
            return "Aprobado";
        }else{
            return "Rechazado";
        }
    }

    public String toString(){
        return "Nombre: " + this.nombreCompleto + "\nCedula: " +
                this.cedula + "\nIngresos Mensuales: " +
                this.ingresosMensuales +"Cantidad de vehiculos registrados: " +
                this.cantidadVehiculos +  "\n¿Vive en Ecuador (true / false)?: " + getPais();
    }
    public static double calcularConsumoMensual(double kmrecorridos) {
        return kmrecorridos / 40.0;
    }
    public static double calcularConsumoMensual() {
        return 1;
    }


}