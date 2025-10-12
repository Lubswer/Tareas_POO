import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static CuentaBancaria nuevoUsuario(Scanner teclado) {
        System.out.println("Ingrese su nombre completo: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su numero cuenta: ");
        String cuenta = teclado.nextLine();
        System.out.println("Ingrese un nickName: ");
        String nickName = teclado.nextLine();
        System.out.println("Ingrese una letra para su QR: ");
        char letra = teclado.next().charAt(0);

        return new CuentaBancaria(nombre, cuenta, nickName, letra);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<>();

        do {
            System.out.println("Bienvenido a Banco Lubswer, Ingrese la opcion que desea realizar: ");
            System.out.println("1. Crear CuentaBancaria");
            System.out.println("2. Consultar CuentaBancaria");
            System.out.println("3. Hacer un retiro");
            System.out.println("4. Hacer un deposito");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    CuentaBancaria nuevoCliente = nuevoUsuario(teclado);
                    cuentasBancarias.add(nuevoCliente);
                    break;
                case 2:
                    System.out.println("Ingrese el numero cuenta que a la desea consultar: ");
                    String direccion = teclado.nextLine();
                    boolean encontrada = false;
                    for (CuentaBancaria cuentita : cuentasBancarias) {

                        String numeroBeneficiario = cuentita.numeroDeCuenta();
                        if (direccion.equalsIgnoreCase(numeroBeneficiario)) {
                            cuentita.mostrar();
                            encontrada = true;
                            break;
                        }
                    }
                    if(!encontrada) {
                        System.out.println("Numero de cuenta no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero cuenta a la que desea retirar dinero: ");
                    String direccion2 = teclado.nextLine();
                    boolean encontrada1 = false;
                    for (CuentaBancaria cuentita : cuentasBancarias) {
                        String numeroBeneficiario = cuentita.numeroDeCuenta();
                        if (direccion2.equalsIgnoreCase(numeroBeneficiario)) {
                            System.out.println("Ingrese el monto a retirar: ");
                            double monto = teclado.nextDouble();
                            cuentita.retirar(monto);
                            encontrada1 = true;
                            break;
                        }
                    }
                    if(!encontrada1) {
                        System.out.println("Numero de cuenta no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el numero cuenta a la que desea depositar dinero: ");
                    String direccion3 = teclado.nextLine();
                    boolean encontrada2 = false;
                    for (CuentaBancaria cuentita : cuentasBancarias) {
                        String numeroBeneficiario = cuentita.numeroDeCuenta();
                        if (direccion3.equalsIgnoreCase(numeroBeneficiario)) {
                            System.out.println("Ingrese el monto a depositar: ");
                            double monto = teclado.nextDouble();
                            cuentita.depositar(monto);
                            encontrada2 = true;
                            break;
                        }
                    }
                    if(!encontrada2) {
                        System.out.println("Numero de cuenta no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema... ");

                    break;
                default:
                    System.out.println("Opcion incorrecta!!!");
            }
        } while (opcion != 5);
    }
}