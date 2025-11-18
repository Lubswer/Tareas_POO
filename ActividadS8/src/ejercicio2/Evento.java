package ejercicio2;
import java.util.ArrayList;

public class Evento {
    private String nombreEvento;
    private String tipoEvento;
    private String fecha;
    private ArrayList<Participante> participantes = new ArrayList<>();

    public Evento(String nombreEvento, String tipoEvento, String fecha){
        if(nombreEvento == null || nombreEvento.isBlank()){
            throw  new IllegalArgumentException("Nulo o vacio!");
        }else if (tipoEvento == null || tipoEvento.isBlank()){
            throw new IllegalArgumentException("Nulo o vacio!");
        }else if(fecha == null || fecha.isBlank()){
            throw new IllegalArgumentException("Nulo o vacio");
        }else{
            this.nombreEvento = nombreEvento;
            this.tipoEvento = tipoEvento;
            this.fecha = fecha;
        }
    }

    public void agregarParticipante(Participante nuevo){
        participantes.add(nuevo);
        System.out.println("Participante agregado al evento");
    }

    public void mostrarParticipantes(){
        if(participantes.isEmpty()){
            System.out.println("No hay participantes inscritos en este evento");
        }else{
            System.out.println("\n======= Participantes registrados en el evento " + nombreEvento + " =======");

            for(Participante p : participantes) {
                p.mostrarTipo();
                System.out.println("Nombre: " + p.getNombreParticipante());

                if(p instanceof Atleta atleta){
                    System.out.println("País: " + atleta.getPais());
                    System.out.println("Edad: " + atleta.getEdad());
                    System.out.println("Género: " + atleta.getGenero());
                }
                else if(p instanceof Equipo equipo){
                    System.out.println("País: " + equipo.getPais());
                    System.out.println("Dueño: " + equipo.getDuenio());
                    System.out.println("Cantidad de Atletas Inscritos: " + equipo.getCantidadAtletasInscritos());

                    // Mostrar lista interna de atletas
                    if(equipo.getAtletas().isEmpty()){
                        System.out.println("El equipo aún no tiene atletas inscritos.");
                    } else {
                        System.out.println("Lista de atletas del equipo:");
                        for(Atleta a : equipo.getAtletas()){
                            System.out.println(" - " + a.getNombreParticipante() + " | " + a.getPais() + " | " + a.getGenero());
                        }
                    }
                }

                System.out.println("----------------------------------------------");
            }
        }
    }


    public String getNombreEvento() {
        return nombreEvento;
    }
}
