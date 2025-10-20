package app;
import datosArtista.Artista;
import datosCancion.Cancion;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static Artista ingresarArtista(Scanner teclado){
        System.out.print("Ingrese el nombre del artista: ");
        String nombre = teclado.nextLine();
        System.out.println(" ");
        System.out.print("Ingrese el genero musical del artista: ");
        String genero = teclado.nextLine();
        System.out.println(" ");
        System.out.print("Ingrese la cantidad de seguidores del artista: ");
        int seguidores = teclado.nextInt();
        System.out.println(" ");
        if((!nombre.isBlank() && !genero.isBlank()) && seguidores > 0){
            System.out.println("Artista ingresado con exito!!");
            return new Artista(nombre, genero, seguidores);
        }else{
            System.out.println("No se pudo crear, revisar que todos los campos sean llenados correctamente!");
        }
        return null;
    }
    public static Cancion ingresarCancion(Scanner teclado){
        System.out.print("Ingrese el titulo de la cancion: ");
        String titulo = teclado.nextLine();
        System.out.println(" ");
        System.out.print("Ingrese la duracion de la cancion en minutos: ");
        double duracion = teclado.nextDouble();
        System.out.println(" ");
        teclado.nextLine();
        System.out.print("Ingrese el numero de reproducciones de la cancion: ");
        int reproducciones = teclado.nextInt();
        System.out.println(" ");
        if((!titulo.isBlank()) && (reproducciones >= 0) && (duracion > 0)){
            System.out.println("Cancion agregada correctamente!");
            return new Cancion(titulo,duracion,reproducciones);
        }else{
            System.out.println("No se pudo crear, revisar que todos los campos sean llenados correctamente!");
        }
        return null;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        ArrayList<Artista> artistas = new ArrayList();
        ArrayList<Cancion> canciones = new ArrayList();
        Cancion ejemploCancion = new Cancion();
        canciones.add(ejemploCancion);
        Artista ejemploArtista = new Artista();
        artistas.add(ejemploArtista);
        System.out.println("///// BIENVENIDO A BeatConnect /////");

        do{
            System.out.println("1. Registrar un artista");
            System.out.println("2. Registrar una cancion");
            System.out.println("3. Aumentar seguidares");
            System.out.println("4. Reproducir una cancion");
            System.out.println("5. Mostrar informacion general");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos para su Artista por ejemplo: ");
                    ejemploArtista.mostrarPerfil();
                    Artista nuevoArtista = ingresarArtista(teclado);
                    artistas.add(nuevoArtista);
                    break;

                case 2:
                    System.out.println("Ingrese los datos para la cancion por ejemplo: ");
                    ejemploCancion.mostrarCancion();
                    Cancion nuevaCancion = ingresarCancion(teclado);
                    canciones.add(nuevaCancion);
                    break;

                case 3:
                    System.out.println("--- AUMENTAR SEGUIDORES ---");
                    System.out.print("Ingrese el nombre del artista a modificar: ");
                    String nombreBusqueda = teclado.nextLine();
                    boolean encontrado = false;
                    for(Artista nombre : artistas){
                        if(nombre.getNombre().equalsIgnoreCase(nombreBusqueda)){
                            System.out.println("Ingrese la cantidad de seguidores a aumentar: ");
                            int seguidores = teclado.nextInt();
                            nombre.setGanarSeguidores(seguidores);
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Artista no encontrado!!");
                    }
                    break;
                case 4:
                    System.out.println("--- REPRODUCIR CANCION ---");
                    System.out.print("Ingrese el titulo de la cancion a reproducir: ");
                    String titulo = teclado.nextLine();
                    boolean encontrado2 = false;
                    for(Cancion nombre : canciones){
                        if(nombre.getTitulo().equalsIgnoreCase(titulo)){
                            System.out.println("Estas reproduciendo : " + nombre.getTitulo());
                            nombre.setReproducir();
                            encontrado2 = true;
                        }
                    }
                    if(!encontrado2){
                        System.out.println("Cancion no encontrada !!");
                    }
                    break;
                case 5:
                    System.out.println("Cantidad de artistas registrados: " + artistas.size());
                    System.out.println("Cantidad de canciones registradas: " + canciones.size());
                    System.out.println("/// Informacion de los artistas ///");
                    for(Artista info : artistas){
                        info.mostrarPerfil();
                        System.out.println("////////////////////");
                    }
                    System.out.println(" ");
                    System.out.println("/// Informacion de las Canciones ///");
                    for(Cancion info : canciones){
                        info.mostrarCancion();
                        System.out.println("////////////////////");
                    }
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Saliendo de BeatConnect...");
            }
        }while(opcion != 6);
        teclado.close();
    }
}