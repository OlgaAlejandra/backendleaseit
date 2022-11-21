package com.leaseit.leasing.entities;

import javax.persistence.*;

@Entity
@Table(name="arrendadores")
public class Arrendador
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "TEP")
    private Long TEP;

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

    public Long getTEP() {
        return TEP;
    }

    public void setTEP(Long TEP) {
        this.TEP = TEP;
    }

    @Override
    public String toString() {
        return "Arrendador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", TEP=" + TEP +
                '}';
    }
    public Arrendador(){

    }
    public Arrendador(String nombre, Long TEP) {
        this.nombre = nombre;
        this.TEP = TEP;
    }
}
