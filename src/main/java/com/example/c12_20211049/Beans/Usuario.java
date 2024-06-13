package com.example.c12_20211049.Beans;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String autorizacion;
    private String correo;
    private String password;
    private int enabled;

    public Usuario(int id, String nombre, String apellido, String autorizacion, String correo, String password, int enabled) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.autorizacion = autorizacion;
        this.correo = correo;
        this.password = password;
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
