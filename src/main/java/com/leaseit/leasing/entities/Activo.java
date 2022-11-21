package com.leaseit.leasing.entities;

import javax.persistence.*;

@Entity
@Table(name="activos")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "precio")
    private Long precio;

    public Activo(){
    }

    public Activo(String tipo, Long precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

}
