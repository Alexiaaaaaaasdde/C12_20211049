package com.example.c12_20211049.Beans;

public class Contacto {
    private String nombrecompletos;
    private String correo;
    private String latitud;
    private String longitud;
    private String telefono;
    private int usuario_id;
    private String pais;
    private String ciudad;

    public Contacto(String nombrecompletos, String correo, String latitud, String longitud, String telefono, int usuario_id, String pais, String ciudad) {
        this.nombrecompletos = nombrecompletos;
        this.correo = correo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.telefono = telefono;
        this.usuario_id = usuario_id;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public String getNombrecompletos() {
        return nombrecompletos;
    }

    public void setNombrecompletos(String nombrecompletos) {
        this.nombrecompletos = nombrecompletos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
