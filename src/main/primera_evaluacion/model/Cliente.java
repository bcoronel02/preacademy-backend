package main.primera_evaluacion.model;

public class Cliente extends Usuario {
    private String nombreCompleto;

    // Constructor vacío
    public Cliente() {
    }

    // Getter y setter
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}