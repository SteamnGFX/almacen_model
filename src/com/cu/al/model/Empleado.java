package com.cu.al.model;

/**
 *
 * @author Componentes Unidos
 * @date 14/03/2023
 */

public class Empleado {

    private int idEmpleado;
    private Usuario usuario;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rfc;
    private String correo;
    private String genero;
    private int telefonoFijo;
    private int telefonoMovil;

    public Empleado() {
    }

    public Empleado(Usuario usuario, String nombre, String apellidoPaterno, String apellidoMaterno, String rfc, String correo, String genero, int telefonoFijo, int telefonoMovil) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rfc = rfc;
        this.correo = correo;
        this.genero = genero;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
    }

    public Empleado(int idEmpleado, Usuario usuario, String nombre, String apellidoPaterno, String apellidoMaterno, String rfc, String correo, String genero, int telefonoFijo, int telefonoMovil) {
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rfc = rfc;
        this.correo = correo;
        this.genero = genero;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", usuario=").append(usuario);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", rfc=").append(rfc);
        sb.append(", correo=").append(correo);
        sb.append(", genero=").append(genero);
        sb.append(", telefonoFijo=").append(telefonoFijo);
        sb.append(", telefonoMovil=").append(telefonoMovil);
        sb.append('}');
        return sb.toString();
    }
    
    

}
