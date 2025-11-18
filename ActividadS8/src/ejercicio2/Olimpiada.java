package ejercicio2;
import Ejercicio3.Estudiante;

import javax.swing.event.EventListenerList;
import  java.util.ArrayList;
public class Olimpiada {
    private String pais;
    private int anio;
    private ArrayList<Evento> eventos = new ArrayList<>();
    public Olimpiada(String pais, int anio){
        if(pais == null || pais.isBlank()){
            throw  new IllegalArgumentException("nulo o vacio");
        }else if(anio <= 0){
            throw new IllegalArgumentException("Año negativo");
        }else{
            this.pais = pais;
            this.anio = anio;
        }
    }
    public void agregarEventos(Evento nuevo){
        eventos.add(nuevo);
        System.out.println("Participante agregado al evento");
    }

}
