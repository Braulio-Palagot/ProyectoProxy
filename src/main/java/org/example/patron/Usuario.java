package org.example.patron;

public class Usuario {
    private String nombre;
    private Boolean logueado;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.logueado = false;
    }

    public void loguear() {
        this.logueado = true;
    }

    public void desloguear() {
        this.logueado = false;
    }

    public Boolean estaLogueado() {
        return this.logueado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
