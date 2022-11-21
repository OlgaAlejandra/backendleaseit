package com.leaseit.leasing.entities;

import javax.persistence.*;

@Entity
@Table(name="activos")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "g_inicial")
    private Long g_inicial;

    public Activo(){
    }

    public Long getG_inicial() {
        return g_inicial;
    }

    public void setG_inicial(Long g_inicial) {
        this.g_inicial = g_inicial;
    }

    public Activo(String nombre, Long precio, Long g_inicial) {
        this.nombre = nombre;
        this.precio = precio;
        this.g_inicial=g_inicial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Activo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", g_inicial=" + g_inicial +
                '}';
    }
}
