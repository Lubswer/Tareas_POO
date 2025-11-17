package Ejercicio4;

public class PagoInvalidoException extends RuntimeException{
    public PagoInvalidoException(String mensaje){
        super(mensaje);
    }
}
