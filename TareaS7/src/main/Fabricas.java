package main;

import main.cliente.Cliente;
import java.util.Scanner;
import java.util.ArrayList;

public class Fabricas {

    Scanner teclado = new Scanner(System.in);


    public static Cliente crearCliente(Scanner teclado){
        String nombre = null;
        String telefono = null;
        String cedula = null;
        String contrasenia = null;
        try{
            System.out.println("Ingrese el nombre del Cliente: ");
            nombre = teclado.nextLine();
        }catch (IllegalArgumentException e){
            System.out.printf("Error: " + e.getMessage());
        }
        try{
            System.out.println("Ingresar cedula: ");
            cedula = teclado.nextLine();

        }catch (IllegalArgumentException e){
            System.out.printf("Error: " + e.getMessage());
        }
        try{
            System.out.println("Ingresar telefono: ");
            telefono = teclado.nextLine();
        }catch (IllegalArgumentException e){
            System.out.printf("Error: " + e.getMessage());
        }
        try{
            System.out.println("Cree una contraseña: ");
            contrasenia = teclado.nextLine();
        }catch (IllegalArgumentException e){
            System.out.printf("Error: " + e.getMessage());
        }
        return new Cliente( nombre, cedula, telefono, contrasenia);

    }

}