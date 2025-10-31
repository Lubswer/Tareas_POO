package ec.gob.beca.modelo;

public class SolicitanteBeca {
    private String nombreCompleto;
    private String cedula;
    private double promedio;
    private double ingresosFamiliares;
    private boolean tieneRecomendacion;

    public SolicitanteBeca(String nombreCompleto, String cedula, double promedio,
                           double ingresosFamiliares, boolean tieneRecomendacion) {
        setNombreCompleto(nombreCompleto);
        setCedula(cedula);
        setPromedio(promedio);
        setIngresosFamiliares(ingresosFamiliares);
        this.tieneRecomendacion = tieneRecomendacion;
    }

    // Getters
    public String getNombreCompleto() { return nombreCompleto; }
    public String getCedula() { return cedula; }
    public double getPromedio() { return promedio; }
    public double getIngresosFamiliares() { return ingresosFamiliares; }
    public boolean isTieneRecomendacion() { return tieneRecomendacion; }

    // Setters con validación
    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto != null && !nombreCompleto.isBlank()) {
            this.nombreCompleto = nombreCompleto.trim();
        } else {
            System.out.println("Nombre inválido, se asignó: Sin nombre");
            this.nombreCompleto = "Sin nombre";
        }
    }

    public void setCedula(String cedula) {
        if (cedula != null && !cedula.isBlank() && cedula.trim().length() == 10) {
            this.cedula = cedula.trim();
        } else {
            System.out.println("Cédula inválida, se asignó: 0000000000");
            this.cedula = "0000000000";
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido, se asignó: 0.0");
            this.promedio = 0.0;
        }
    }

    public void setIngresosFamiliares(double ingresosFamiliares) {
        if (ingresosFamiliares >= 0) {
            this.ingresosFamiliares = ingresosFamiliares;
        } else {
            System.out.println("Ingresos inválidos, se asignaron: 0.0");
            this.ingresosFamiliares = 0.0;
        }
    }

    public void setTieneRecomendacion(boolean tieneRecomendacion) {
        this.tieneRecomendacion = tieneRecomendacion;
    }

    // Métodos de negocio
    public boolean becaAprobada() {
        return promedio >= 8.5 && ingresosFamiliares <= 1000.0 && tieneRecomendacion;
    }

    public void generarResultado() {
        System.out.print("Resultado: ");
        if (becaAprobada()) {
            System.out.println("Beca aprobada.");
        } else {
            System.out.println("Beca rechazada.");
        }
    }

    @Override
    public String toString() {
        return "Datos del solicitante:\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cédula: " + cedula + "\n" +
                "Promedio: " + promedio + "\n" +
                "Ingresos familiares: " + ingresosFamiliares + "\n" +
                "Tiene recomendación: " + tieneRecomendacion;
    }

    public static void mostrarReglasBeca() {
        System.out.println("=== REGLAS PARA APROBACIÓN DE BECA ===");
        System.out.println("1. Promedio académico mínimo: 8.5 / 10.0");
        System.out.println("2. Ingresos familiares máximos: $1,000.00");
        System.out.println("3. Carta de recomendación: Obligatoria");
    }

    // Sobrecarga de métodos - ACTUALIZADO a 20 horas base
    public double calcularHorasEstudio() {
        return 20.0;
    }

    public double calcularHorasEstudio(int horasAdicionales) {
        return 20.0 + horasAdicionales;
    }
}
