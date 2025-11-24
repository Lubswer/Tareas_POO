import com.sun.security.jgss.GSSUtil;
import ejercicio5.DatosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class mainTaller {
    public static void main(String [] args){
        int opcion = 0;
        int opcion2 = 0;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Candidata> candidatas = new ArrayList<>();
        do{
            System.out.println("// Sistema de candidatas //");
            System.out.println("1. Registrar Candidata");
            System.out.println("2. Listar todas");
            System.out.println("3. Filtrar por Distrito y tipo");
            System.out.println("4. Simular voto");
            System.out.println("5. Mostrar resultados y ganador");
            System.out.println("6. Salir");
            System.out.print("-> Seleccione una opcion: ");
            try{
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1:
                        do{
                        System.out.println("** Seleccione el tipo de Candidata **");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Profesional");
                        System.out.println("3. Volver");
                        System.out.println("-> Seleccione una opcion: ");
                        opcion2 = teclado.nextInt();

                            switch (opcion2){
                                case 1:
                                    candidatas.add(crearEstudiante(teclado));
                                    System.out.println("Candidata Registrada!");
                                    break;
                                case 2:
                                    candidatas.add(crearProfesional(teclado));
                                    System.out.println("Candidata Registrada!");
                                    break;
                                case 3:
                                    System.out.println("Volviendo... ");
                                    break;
                                default:
                                    System.out.println("Digito uera de rango!");
                                    break;
                            }
                        }while (opcion2 != 3);
                        break;
                    case 2:
                        System.out.println("Lista de candidatas");
                        if(candidatas.isEmpty()){
                            System.out.println("No existen registros");
                        }else {
                            for(Candidata c : candidatas){
                                 c.mostrarDetalles();
                                System.out.println("==================================");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("== Candidatas por Distrito ==");
                        if(candidatas.isEmpty()){
                            System.out.println("No existen registros");
                        }else{
                            System.out.println("Candidatas estudiantes: ");
                            for(Candidata c : candidatas){
                                if(c instanceof CandidataEstudiante){
                                    CandidataEstudiante ca = (CandidataEstudiante) c;
                                    System.out.println("* " + ca.getNombre()  + " -> Distrito: " + ca.getDistrito() + "-> Tipo Estudiante");
                                }
                            }
                            System.out.println("Candidatas profecionales: ");
                            for(Candidata c : candidatas){
                                if(c instanceof CandidataProfecional){
                                    CandidataProfecional cb = (CandidataProfecional) c;
                                    System.out.println("* " + cb.getNombre()  + " -> Distrito: " + cb.getDistrito() + "-> Tipo Profesional");
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("/// Simular voto ///");
                        // logica
                        break;
                    case 5:
                        System.out.println("//== Resultados de la votacion ==//");
                        //Logica
                        break;
                    default:
                        System.out.println("Opcion fuera del rango indicado!");
                }
            } catch (InputMismatchException ime){
                System.out.println("Error, opcion solo tipo numericas");
                teclado.nextLine();
            } catch (DatosInvalidosException die){
                System.out.println("Error: " + die.getMessage());
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }while(opcion != 5);
    }
    public static CandidataEstudiante crearEstudiante(Scanner teclado){
        System.out.print("Ingrese la ID: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el distrito: ");
        String distrito = teclado.nextLine();
        int puntaje = 0;
        System.out.print("Ingrese la universidad: ");
        String universidad = teclado.nextLine();
        System.out.print("Ingrese la carrera: ");
        String carrera = teclado.nextLine();

        return new CandidataEstudiante(id,nombre,apellido,edad,distrito,puntaje,universidad,carrera);

    }
    public static CandidataProfecional crearProfesional(Scanner teclado){
        System.out.print("Ingrese la ID: ");
        int id = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el distrito: ");
        String distrito = teclado.nextLine();
        int puntaje = 0;
        System.out.print("Ingrese la profesion: ");
        String profesion = teclado.nextLine();
        System.out.print("Ingrese los años de experiencia: ");
        int experiencia = teclado.nextInt();
        teclado.nextLine();

        return new CandidataProfecional(id,nombre,apellido,edad,distrito,puntaje,profesion,experiencia);

    }



}
