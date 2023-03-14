package com.cu.al.model;

/**
 *
 * @author Componentes Unidos
 * @date 14/03/2023
 */

public class Producto {
    
    private int idProducto;
    private String nombre;
    private String marca;
    private String descripcion;
    private String existencias;
    private String proveedor;
    private String fechaEntrada;
    private String estante;

    public Producto() {
    }

    public Producto(String nombre, String marca, String descripcion, String existencias, String proveedor, String fechaEntrada, String estante) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.proveedor = proveedor;
        this.fechaEntrada = fechaEntrada;
        this.estante = estante;
    }

    public Producto(int idProducto, String nombre, String marca, String descripcion, String existencias, String proveedor, String fechaEntrada, String estante) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.proveedor = proveedor;
        this.fechaEntrada = fechaEntrada;
        this.estante = estante;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExistencias() {
        return existencias;
    }

    public void setExistencias(String existencias) {
        this.existencias = existencias;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", marca=").append(marca);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", existencias=").append(existencias);
        sb.append(", proveedor=").append(proveedor);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", estante=").append(estante);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
