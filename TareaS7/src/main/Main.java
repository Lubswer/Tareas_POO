package main;

import main.cliente.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

import static main.Fabricas.crearCliente;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        do{
            System.out.println("====== Sistema Bancario ======");
            System.out.println(">>> Elija una opcion");
            System.out.println("1.Registro de Cliente\n2.Ingresar como cliente\n3.Ingresar como empleado(cajero,balcón,jefe)");
            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    try{
                        Cliente nuevo = crearCliente(teclado);
                    }
            }

        }while(opcion != 4);

    }
    }
