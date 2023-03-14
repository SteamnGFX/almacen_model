package com.cu.al.model;


public class Reportes {
    
    private int idReporte;
    private Salidas salidas;

    public Reportes() {
    }

    public Reportes(Salidas salidas) {
        this.salidas = salidas;
    }

    public Reportes(int idReporte, Salidas salidas) {
        this.idReporte = idReporte;
        this.salidas = salidas;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Salidas getSalidas() {
        return salidas;
    }

    public void setSalidas(Salidas salidas) {
        this.salidas = salidas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reportes{");
        sb.append("idReporte=").append(idReporte);
        sb.append(", salidas=").append(salidas);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
