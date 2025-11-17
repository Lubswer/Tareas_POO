package main;

import main.cliente.Cliente;

import java.util.Scanner;

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
            System.out.println("Ingresar nombre: ");
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
        if ((nombre == null || nombre.isBlank()) || (cedula == null || cedula.isBlank()) || (telefono == null || telefono.isBlank()) || (contrasenia == null || contrasenia.isBlank())) {
            // Unir con catch de mostrar exepcioon tipo null;
            return null;
        }else{
            return new Cliente( nombre, cedula, telefono, contrasenia);
        }
    }

}