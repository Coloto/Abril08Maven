package com.softtek.presentacion;

import com.softtek.modelo.Producto;
import com.softtek.persistencia.ProductoException;

public class Main {
    public static void main(String[] args) {
        try {
            Producto producto1 = new Producto("1", "Silla", 15.99, "Ikea", "Silla de madera");
            Producto producto2 = new Producto();
            System.out.println(producto1.comprobar());
            System.out.println(producto2.comprobar());
        } catch (ProductoException e) {
            System.out.println("-------------");
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
