package main.primera_evaluacion.model;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    private List<ItemCarrito> items;
    private Cupon cupon;
    private Cliente cliente;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    // Getters y setters
    public List<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }

    public Cupon getCupon() {
        return cupon;
    }

    public void setCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos de funcionalidad
    public void agregarProducto(Producto producto, int cantidad) {
        // Buscar si el producto ya está en el carrito
        for (ItemCarrito item : items) {
            if (item.getProducto().getId() == producto.getId()) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }

        // Si no está, agregarlo como nuevo ítem
        ItemCarrito nuevoItem = new ItemCarrito.Builder()
                .producto(producto)
                .cantidad(cantidad)
                .build();
        items.add(nuevoItem);
    }

    public void quitarProductoPorId(int idProducto) {
        for (ItemCarrito item : items) {
            if (item.getProducto().getId() == idProducto) {
                if (item.getCantidad() > 1) {
                    item.setCantidad(item.getCantidad() - 1);
                } else {
                    items.remove(item);
                }
                return;
            }
        }
    }

    public double calcularSubtotal() {
        return items.stream()
                .mapToDouble(ItemCarrito::calcularSubtotal)
                .sum();
    }

    public double calcularTotalConDescuento() {
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuentoFinal();
        return subtotal * (1 - descuento / 100);
    }

    public void aplicarCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public List<ItemCarrito> obtenerItemsPorCategoria(String categoria) {
        return items.stream()
                .filter(item -> item.getProducto().getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    public int obtenerCantidadTotalProductos() {
        return items.stream()
                .mapToInt(ItemCarrito::getCantidad)
                .sum();
    }

    public double obtenerPromedioPrecioProductos() {
        return items.stream()
                .mapToDouble(item -> item.getProducto().getPrecio())
                .average()
                .orElse(0.0);
    }

    public void mostrarResumen() {
        System.out.println("--- Resumen del Carrito ---");
        System.out.println("Cliente: " + (cliente != null ? cliente.getNombreCompleto() : "No especificado"));

        System.out.println("\nProductos en el carrito:");
        items.forEach(item -> System.out.printf(
                "- %s (x%d): $%.2f c/u -> Subtotal: $%.2f%n",
                item.getProducto().getNombre(),
                item.getCantidad(),
                item.getProducto().getPrecio(),
                item.calcularSubtotal()
        ));

        double subtotal = calcularSubtotal();
        double descuento = calcularDescuentoFinal();
        double total = calcularTotalConDescuento();

        System.out.printf("%nSubtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento aplicado: %.2f%%%n", descuento);
        System.out.printf("Total con descuento: $%.2f%n", total);
        System.out.println("===========================");
    }

    private double calcularDescuentoFinal() {
        if (cupon != null) {
            return cupon.getPorcentajeDescuento();
        }

        double subtotal = calcularSubtotal();
        if (subtotal > 10000) {
            return 10;
        } else if (subtotal > 5000) {
            return 5;
        }
        return 0;
    }
}