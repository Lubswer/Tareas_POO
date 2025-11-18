package ejercicio1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GestionPrecios {

    public static void main(String[] args){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> precios = new ArrayList<>();

        do{
            try{
                System.out.println("==== MENÚ DE PRECIOS INMOBILIARIOS ====");
                System.out.println("1. Ingresar precio");
                System.out.println("2. Mostrar todos los precios");
                System.out.println("3. Mostrar precio mas alto");
                System.out.println("4. Mostrar precio mas bajo");
                System.out.println("5. Mostrar precios iguales");
                System.out.println("6. Buscar un precio especifico");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1:
                        ingresarPrecio(teclado,precios);
                        break;
                    case 2:
                        mostrarPrecios(precios);
                        break;
                    case 3:
                        precioAlto(precios);
                        break;
                    case 4:
                        precioBajo(precios);
                        break;
                    case 5:
                        mostrarIguales(teclado,precios);
                        break;
                    case 6:
                        buscarPrecio(teclado,precios);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion fuera de rango");
                        break;

                }

            }catch (InputMismatchException ime){
                System.out.println("Error en ingreso de digitos solo numericos!");
                teclado.nextLine();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }

        }while(opcion != 7);

    }
    // Metodos
    public static void ingresarPrecio(Scanner teclado, ArrayList<Double> precios){
        System.out.print("Ingrese un precio: $");
        double precio = teclado.nextDouble();
        if (precio > 0) {
            precios.add(precio);
            System.out.println("Precio agregado correctamente.");
        } else {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }
    }
    public static void mostrarPrecios(ArrayList<Double> precios){
        if(precios.isEmpty()){
            System.out.println("No existen registros!");
        }else{
            System.out.println(">>> Lista de precios");
            int posicion = 1;
            for(Double p : precios){
                System.out.println((posicion) + ". " + p + "$");
                posicion += 1;
            }
        }
    }
    public static void precioAlto(ArrayList<Double> precios){
        if(precios.isEmpty()){
            System.out.println("Sin registros existentes!");
        }else{
            double masAlto = precios.get(0);
            for(Double p: precios){
                if( p >= masAlto){
                    masAlto = p;
                }
            }
            System.out.println("Precio mas alto $ " + masAlto);
        }
    }
    public static void precioBajo(ArrayList <Double> precios){
        if(precios.isEmpty()){
            System.out.println("No existen registros!");
        }else{
            double masBajo = precios.get(0);
            for(Double p: precios){
                if(p < masBajo){
                    masBajo = p;
                }
            }
            System.out.println("Precio mas bajo $ " + masBajo);
        }
    }
    public static void mostrarIguales(Scanner teclado, ArrayList<Double> precios){
        if(precios.isEmpty()){
            System.out.println("No existen registros!");
        }else{
            System.out.print("Ingrese el precio a comparar: ");
            double igual = teclado.nextDouble();
            int posicion = 1;
            boolean encontrado = false;
            for (Double p : precios){
                if(p == igual){
                    System.out.println("Precio igual encontrado en posicion: "  + posicion);
                    encontrado = true;
                }
                posicion += 1;
            }
            if(!encontrado){
                System.out.println("No se encontro un precio similar :(");
            }
        }
    }
    public static void buscarPrecio(Scanner teclado, ArrayList<Double> precios){
        if(precios.isEmpty()){
            System.out.println("No existen registros!");
        }else{
            System.out.print("Ingrese el precio a buscar: ");
            double igual = teclado.nextDouble();
            int posicion = 1;
            boolean encontrado = false;
            for (Double p : precios){
                if(p == igual){
                    System.out.println("Precio encontrado en posicion: "  + posicion);
                    encontrado = true;
                    break;
                }
                posicion += 1;
            }
            if(!encontrado){
                System.out.println("No se encontro un precio similar :(");
            }
        }
    }

}
