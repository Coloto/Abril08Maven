package com.softtek.modelo;

import com.softtek.persistencia.ProductoException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public String comprobar() throws ProductoException {
        if (id == null){
            throw new ProductoException("El producto no tiene id");
        } else {
            return toString();
        }

    }
}
