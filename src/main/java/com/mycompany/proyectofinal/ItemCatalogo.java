package com.mycompany.proyectofinal;

public class ItemCatalogo {
    private String categorias;
    private String productos;

    public ItemCatalogo(String categoria, String producto) {
        this.categorias = categoria;
        this.productos = producto;
    }

    public String getCategoria() {
        return categorias;
    }

    public String getProducto() {
        return productos;
    }
}