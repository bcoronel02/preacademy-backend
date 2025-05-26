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


    }
}