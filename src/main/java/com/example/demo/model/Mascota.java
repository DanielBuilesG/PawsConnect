package com.example.demo.model;

public class Mascota {
    private Long id;
    private String nombre;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}