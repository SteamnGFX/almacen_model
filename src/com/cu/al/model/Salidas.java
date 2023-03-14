package com.cu.al.model;

public class Salidas {

    private int idSalidas;
    private int salidaIndividual;
    private int salidaTotal;
    private String fechaSalida;
    private Producto producto;

    public Salidas() {
    }

    public Salidas(int salidaIndividual, int salidaTotal, String fechaSalida, Producto producto) {
        this.salidaIndividual = salidaIndividual;
        this.salidaTotal = salidaTotal;
        this.fechaSalida = fechaSalida;
        this.producto = producto;
    }

    public int getIdSalidas() {
        return idSalidas;
    }

    public void setIdSalidas(int idSalidas) {
        this.idSalidas = idSalidas;
    }

    public int getSalidaIndividual() {
        return salidaIndividual;
    }

    public void setSalidaIndividual(int salidaIndividual) {
        this.salidaIndividual = salidaIndividual;
    }

    public int getSalidaTotal() {
        return salidaTotal;
    }

    public void setSalidaTotal(int salidaTotal) {
        this.salidaTotal = salidaTotal;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
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
        sb.append("Salidas{");
        sb.append("idSalidas=").append(idSalidas);
        sb.append(", salidaIndividual=").append(salidaIndividual);
        sb.append(", salidaTotal=").append(salidaTotal);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", producto=").append(producto);
        sb.append('}');
        return sb.toString();
    }

    
}