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

    @Column(name = "p_recompra")
    private Long p_recompra;

    @Column(name = "comision")
    private Long comision;

    @Column(name = "s_riesgo")
    private Long s_riesgo;

    public Long getS_riesgo() {
        return s_riesgo;
    }

    public void setS_riesgo(Long s_riesgo) {
        this.s_riesgo = s_riesgo;
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

    public Long getTEP() {
        return TEP;
    }

    public void setTEP(Long TEP) {
        this.TEP = TEP;
    }

    public Long getP_recompra() {
        return p_recompra;
    }

    public void setP_recompra(Long p_recompra) {
        this.p_recompra = p_recompra;
    }

    public Long getComision() {
        return comision;
    }

    public void setComision(Long comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Arrendador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", TEP=" + TEP +
                ", p_recompra=" + p_recompra +
                ", comision=" + comision +
                ", s_riesgo=" + s_riesgo +
                '}';
    }

    public Arrendador(){

    }

    public Arrendador(String nombre, Long TEP, Long p_recompra, Long comision, Long s_riesgo) {
        this.nombre = nombre;
        this.TEP = TEP;
        this.p_recompra = p_recompra;
        this.comision = comision;
        this.s_riesgo = s_riesgo;
    }
}
