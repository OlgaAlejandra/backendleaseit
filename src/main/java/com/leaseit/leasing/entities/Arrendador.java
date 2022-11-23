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
    private float TEP;

    @Column(name = "p_recompra")
    private float p_recompra;

    @Column(name = "comision")
    private float comision;

    @Column(name = "s_riesgo")
    private float s_riesgo;

    @Column(name = "tasa_type")
    private String tasa_type;

    @Column(name = "t_tasa")
    private String t_tasa;

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

    public float getTEP() {
        return TEP;
    }

    public void setTEP(float TEP) {
        this.TEP = TEP;
    }

    public float getP_recompra() {
        return p_recompra;
    }

    public void setP_recompra(float p_recompra) {
        this.p_recompra = p_recompra;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float getS_riesgo() {
        return s_riesgo;
    }

    public void setS_riesgo(float s_riesgo) {
        this.s_riesgo = s_riesgo;
    }

    public String getTasa_type() {
        return tasa_type;
    }

    public void setTasa_type(String tasa_type) {
        this.tasa_type = tasa_type;
    }

    public String getT_tasa() {
        return t_tasa;
    }

    public void setT_tasa(String t_tasa) {
        this.t_tasa = t_tasa;
    }

    public Arrendador(String nombre, float TEP, float p_recompra, float comision, float s_riesgo, String tasa_type, String t_tasa) {
        this.nombre = nombre;
        this.TEP = TEP;
        this.p_recompra = p_recompra;
        this.comision = comision;
        this.s_riesgo = s_riesgo;
        this.tasa_type = tasa_type;
        this.t_tasa = t_tasa;
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
                ", tasa_type='" + tasa_type + '\'' +
                ", t_tasa='" + t_tasa + '\'' +
                '}';
    }

    public Arrendador(){}
}
