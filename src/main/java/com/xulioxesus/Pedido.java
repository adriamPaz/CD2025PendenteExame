package com.xulioxesus;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa un pedido, formado por una lista de elementos de clase producto.
 */

public class Pedido {
    private List<Producto> productos;
    /**
     * Constructor de la clase.
     * No requiere parámetros.
     * Inicializa un array de productos
     */

    public Pedido() {
        productos = new ArrayList<>();
    }
    /**
     * Recibe un producto y lo agrega al array de productos.
     * @param producto producto a agregar.
     */

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    /**
     * Devuelve la suma del precio de todos los productos.
     * @return suma del precio de todos los productos.
     */

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getTotal();
        }
        return total;
    }
}
