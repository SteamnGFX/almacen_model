package com.cu.al.model;

/**
 *
 * @author Componentes Unidos
 * @date 14/03/2023
 */

public class Usuario {
    
    private int idUsuario;
    private String usuario;
    private String contrasenia;
    private String token;
    private String rol;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", usuario=").append(usuario);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append(", token=").append(token);
        sb.append(", rol=").append(rol);
        sb.append('}');
        return sb.toString();
    }

    
}