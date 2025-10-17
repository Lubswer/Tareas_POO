public class CuentaBancaria {
    private double saldo = 0;
    private String titular;
    public CuentaBancaria() {
        this.titular = "Lubswer Catagña";
    }

    public void setDepositar(double deposito) {

        if (deposito >0) {
            this.saldo += deposito                                                                                                                                                      ;
            System.out.println("Deposito valido!!");

        }else{
            if(deposito == 0){
                System.out.println("Debe ingresar una cantidad mayor a cero!!");

            }else{
                if(deposito < 0){
                    System.out.println("Debe ingresar una cantidad mayor a cero!!");
                }
            }
        }
    }
    public void setRetirar(double retiro) {
        if(retiro == 0){
            System.out.println("Debe ingresar una cantidad mayor a cero!!");
        }else{
            if(retiro < 0){
                System.out.println("Debe ingresar una cantidad mayor a cero!!");
            }else{
                if(this.saldo < retiro){
                    System.out.println("Retiro valido, es mayor al saldo!!");

                }else{
                    if(this.saldo > retiro){
                        this.saldo -= retiro;
                        System.out.println("Retiro valido, es mayor al saldo!!");
                    }
                }
            }

        }
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getTitular() {
        return this.titular;
    }
}

