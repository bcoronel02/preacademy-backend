package main.primera_evaluacion.model;

public class Cupon {
    private String codigo;
    private double porcentajeDescuento;

    // Constructor vacío
    public Cupon() {

    }

    // Getters y setters
    public String getCodigo() {
        return codigo;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}