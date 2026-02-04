package com.xulioxesus;

/**
 * Clase producto, formada por nombre, precio y cantidad de un producto.
 *
 */

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    /**
     * Constructor de producto.
     * @param nombre nombre del producto.
     * @param precio precio unitario del producto.
     * @param cantidad cantidad de producto.
     */

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    /**
     * Devuelve el nombre del producto.
     * @return nombre del producto.
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el precio del producto.
     * @return precio del producto.
     */

    public double getPrecio() {
        return precio;
    }
    /**
     * Devulve la cantidad de un producto.
     * @return cantidad de producto.
     */

    public int getCantidad() {
        return cantidad;
    }
    /**
     * Devuelve el producto del precio y la cantidad de un producto.
     * @return producto del precio por la cantidad del producto.
     */

    public double getTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + cantidad + " x " + precio + " = " + getTotal();
    }
}
