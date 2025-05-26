package main.primera_evaluacion.service;

import main.primera_evaluacion.model.*;

public class CarritoService {
    public static void main(String[] args) {
        // Crear productos con Builder
        Producto producto1 = new Producto.Builder()
                .id(1)
                .nombre("Smartphone")
                .precio(25000)
                .categoria("Electrónicos")
                .build();

        Producto producto2 = new Producto.Builder()
                .id(2)
                .nombre("Notebook")
                .precio(50000)
                .categoria("Electrónicos")
                .build();

        Producto producto3 = new Producto.Builder()
                .id(3)
                .nombre("Auriculares")
                .precio(5000)
                .categoria("Accesorios")
                .build();

        // Crear cliente
        Cliente cliente = new Cliente();
        cliente.setNombreCompleto("Brenda Coronel");

        // Crear carrito y lo asigna al cliente
        Carrito carrito = new Carrito();
        carrito.setCliente(cliente);

        // Agregar productos al carrito
        carrito.agregarProducto(producto1, 2);
        carrito.agregarProducto(producto2, 1);
        carrito.agregarProducto(producto3, 3);

        // Crea y aplica cupon de descuento
        Cupon cupon = new Cupon();
        cupon.setCodigo("HOT-SALE20");
        cupon.setPorcentajeDescuento(20);
        carrito.aplicarCupon(cupon);

    }
}