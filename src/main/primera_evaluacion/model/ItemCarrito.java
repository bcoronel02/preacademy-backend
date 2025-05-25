package main.primera_evaluacion.model;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    // Constructor vacío
    public ItemCarrito() {
    }

    // Getters y setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo para calcular subtotal
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Patrón Builder
    public static class Builder {
        private ItemCarrito item;

        public Builder() {
            item = new ItemCarrito();
        }

        public Builder producto(Producto producto) {
            item.producto = producto;
            return this;
        }

        public Builder cantidad(int cantidad) {
            item.cantidad = cantidad;
            return this;
        }

        public ItemCarrito build() {
            return item;
        }
    }
}