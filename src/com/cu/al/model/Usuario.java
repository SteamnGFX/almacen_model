package com.cu.al.model;

public class Usuario {
    
    private int idUsuario;
    private String Usuario;
    private String contrasenia;
    private String token;
    private String rol;

    public Usuario() {
    }

    public Usuario(String Usuario, String contrasenia, String token, String rol) {
        this.Usuario = Usuario;
        this.contrasenia = contrasenia;
        this.token = token;
        this.rol = rol;
    }

    public Usuario(int idUsuario, String Usuario, String contrasenia, String token, String rol) {
        this.idUsuario = idUsuario;
        this.Usuario = Usuario;
        this.contrasenia = contrasenia;
        this.token = token;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
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
        sb.append(", Usuario=").append(Usuario);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append(", token=").append(token);
        sb.append(", rol=").append(rol);
        sb.append('}');
        return sb.toString();
    }
    
    
}