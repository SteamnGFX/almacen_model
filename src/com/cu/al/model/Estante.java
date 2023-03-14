package com.cu.al.model;


public class Estante {
    private int idEstante;
    private String nombreEstante;
    private int cantidad;
    private Producto producto;

    public Estante() {
    }

    public Estante(String nombreEstante, int cantidad, Producto producto) {
        this.nombreEstante = nombreEstante;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Estante(int idEstante, String nombreEstante, int cantidad, Producto producto) {
        this.idEstante = idEstante;
        this.nombreEstante = nombreEstante;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdEstante() {
        return idEstante;
    }

    public void setIdEstante(int idEstante) {
        this.idEstante = idEstante;
    }

    public String getNombreEstante() {
        return nombreEstante;
    }

    public void setNombreEstante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estante{");
        sb.append("idEstante=").append(idEstante);
        sb.append(", nombreEstante=").append(nombreEstante);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", producto=").append(producto);
        sb.append('}');
        return sb.toString();
    }
    
}
