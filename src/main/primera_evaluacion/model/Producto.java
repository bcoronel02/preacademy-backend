package main.primera_evaluacion.model;

public class Producto {
   private int id;
   private String nombre;
   private double precio;
   private String categoria;

   //Constructor vacío
    public Producto() {
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    // Patrón Builder
    public static class Builder {
        private Producto producto;

        public Builder() {
            producto = new Producto();
        }

        public Builder id(int id) {
            producto.id = id;
            return this;
        }

        public Builder nombre(String nombre) {
            producto.nombre = nombre;
            return this;
        }

        public Builder precio(double precio) {
            producto.precio = precio;
            return this;
        }

        public Builder categoria(String categoria) {
            producto.categoria = categoria;
            return this;
        }

        public Producto build() {
            return producto;
        }
    }





}
