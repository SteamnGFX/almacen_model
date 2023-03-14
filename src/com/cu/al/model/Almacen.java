package com.cu.al.model;

/**
 *
 * @author Componentes Unidos
 * @date 14/03/2023
 */

public class Almacen {
    private int idAlmacen;
    private Estante estante;

    public Almacen() {
    }

    public Almacen(Estante estante) {
        this.estante = estante;
    }

    public Almacen(int idAlmacen, Estante estante) {
        this.idAlmacen = idAlmacen;
        this.estante = estante;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Almacen{");
        sb.append("idAlmacen=").append(idAlmacen);
        sb.append(", estante=").append(estante);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
