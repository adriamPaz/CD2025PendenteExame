package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    void testAgregarProductoNormal() {
        Producto producto = new Producto("pan", 1, 2);
        Pedido pedido = new Pedido();
        pedido.agregarProducto(producto);
        
    }
    @Test
    void testAgregarProductoNulo() {
        Producto producto = new Producto(null, 0, 0);
        Pedido pedido = new Pedido();
        pedido.agregarProducto(producto);
    }


    @Test
    void testCalcularTotalNormal() {
        Pedido p = new Pedido();
        Producto p1 = new Producto("Col", 2.5, 10);
        Producto p2 = new Producto("sal", 0.5, 5);
        p.agregarProducto(p2);
        p.agregarProducto(p1);
        p.calcularTotal();
    }

    @Test
    void testCalcularTotalPrecioNegativo() {
        Pedido p = new Pedido();
        Producto p1 = new Producto("Col", -2.5, 10);
        Producto p2 = new Producto("sal", 0.5, 5);
        p.agregarProducto(p2);
        p.agregarProducto(p1);
        p.calcularTotal();
    }

    @Test
    void testCalcularTotalPrecioCero() {
        Pedido p = new Pedido();
        Producto p1 = new Producto("Col", 2.5, 10);
        Producto p2 = new Producto("sal", 0, 5);
        p.agregarProducto(p2);
        p.agregarProducto(p1);
        p.calcularTotal();
    }


}
