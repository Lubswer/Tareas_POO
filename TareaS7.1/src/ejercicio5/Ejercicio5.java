package ejercicio5;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio5 {
    public static Producto crearProductoNacional(Scanner teclado){
        System.out.println("Ingrese el nombre del produto: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();

        return new Producto("PNA", nombre,precio);
    }
    public static Producto crearProductoImportado(Scanner teclado){
        System.out.println("Ingrese el nombre del produto: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el precio del producto ");
        double precio = teclado.nextDouble();
        return new Producto("PIM", nombre,precio);
    }
    public static void main(String[] args){
        int opcion = 0;
        int contadorNacional = 1;
        int contadorImportado = 1;
        Scanner teclado = new Scanner(System.in);
        double iva = 0.12;
        double  imp = 0.05;
        ArrayList<Producto> productos = new ArrayList<>();
        do {
        try{

                System.out.println(">>> Registro de productos");
                System.out.println("1. Producto Nacional");
                System.out.println("2. Producto Importado");
                System.out.println("3. visualizar productos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion){
                    case 1:
                        Producto nuevoN = crearProductoNacional(teclado);
                        nuevoN.agregarNumero(contadorNacional);
                        System.out.println("Registro exitoso!!");
                        contadorNacional +=1;
                        productos.add(nuevoN);
                        break;
                    case 2:
                        Producto nuevoI = crearProductoImportado(teclado);
                        nuevoI.agregarNumero(contadorImportado);
                        contadorImportado +=1;
                        productos.add(nuevoI);
                        break;
                    case 3:
                        if(productos.isEmpty()){
                            throw new DatosInvalidosException("Lista vacia");
                        }else{

                            System.out.println("===================================        Productos     ==========================================");
                            for (Producto pn : productos){
                                String code = pn.getCodigo();
                                if(code.startsWith("PNA")){
                                    System.out.println("|Tipo: Nacional | Código unico: " + pn.getCodigo() + " | Nombre: " + pn.getNombre() + " | Precio con Impuesto: " + (pn.getPrecioBase() + (pn.getPrecioBase() * iva)) + "$ | Precio base: " + pn.getPrecioBase() + " $ |");
                                }else if(code.startsWith("PIM")){
                                    System.out.println("|Tipo: Importado | Código unico: " + pn.getCodigo() + " | Nombre:   " + pn.getNombre() + "    | Precio con Impuesto: " + (pn.getPrecioBase() + (pn.getPrecioBase() * imp)) + "$ | Precio base: "+ pn.getPrecioBase() + " $ |");
                                }else{
                                    throw new DatosInvalidosException("Error en lista de productos!");
                                }
                            }

                        }
                        break;
                    case 4:
                        System.out.println("Saliendo del Registro...");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

        }
        catch (DatosInvalidosException die){
            System.out.println("Error! : " + die.getMessage());
        }
        catch (InputMismatchException ime){
            System.out.println("Error, en el tipo de dato numerico");
            teclado.nextLine();
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        }while(opcion != 4);
        teclado.close();
    }
}
