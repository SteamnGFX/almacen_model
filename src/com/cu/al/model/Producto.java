package com.cu.al.model;

public class Producto {

    private int idProducto;
    private String nombre;
    private String tipo;
    private String marca;
    private String descripcion;
    private int existencias;
    private String proveedor;
    private String fechaEntrada;
    private int estatus;

    public Producto() {
    }

    public Producto(String nombre, String tipo, String marca, String descripcion, int existencias, String proveedor, String fechaEntrada, int estatus) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.proveedor = proveedor;
        this.fechaEntrada = fechaEntrada;
        this.estatus = estatus;
    }

    public Producto(int idProducto, String nombre, String tipo, String marca, String descripcion, int existencias, String proveedor, String fechaEntrada, int estatus) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.proveedor = proveedor;
        this.fechaEntrada = fechaEntrada;
        this.estatus = estatus;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
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

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", marca=").append(marca);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", existencias=").append(existencias);
        sb.append(", proveedor=").append(proveedor);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", estatus=").append(estatus);
        sb.append('}');
        return sb.toString();
    }

}
