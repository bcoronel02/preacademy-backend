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



}