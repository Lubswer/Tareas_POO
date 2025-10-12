
public class CuentaBancaria {
    private String nombreDelTitular;
    private double saldo;
    public String numeroDeCuenta;
    public String nickName;
    public char qR; //aun no se como meter un qr asi hare que sea algun caracter cualquiera, para el ejemplo

    public CuentaBancaria(String nombreDelTitular, String numeroDeCuenta, String nickName,char qR) {
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0.0;
        this.nickName = nickName;
        this.qR = qR;
    }

    public void depositar(double deposito){
        if(deposito>0){
            this.saldo += deposito;
            System.out.println("Deposito exitso!! ");
        }else{
            System.out.println("Deposito invalido!! ");
        }
    }

    public void retirar(double retiro){
        if((this.saldo - retiro) < 0){
            System.out.println("NO puedes retirar esa cantidad, fondos insuficientes");
        }else{
            this.saldo -= retiro;
            System.out.println("Retiro exitso!! ");
        }
    }

    public String numeroDeCuenta(){

        return this.numeroDeCuenta;

    }

    public void mostrar(){
        System.out.println("Datos: ");
        System.out.println("Nombre del Titular: " + this.nombreDelTitular);
        System.out.println("Saldo: " + this.saldo + " $");
        System.out.println("Numero de Cuenta: " + this.numeroDeCuenta);
        System.out.println("NickName: " + this.nickName);
        System.out.println("QR: " + this.qR);

    }
}
