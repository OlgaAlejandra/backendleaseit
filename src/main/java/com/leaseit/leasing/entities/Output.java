package com.leaseit.leasing.entities;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Output")
public class Output {
    @Id
    private Long id;
    @OneToOne
    @MapsId
    private Operation operacion;

    @Column(name = "n_año")
    private Long n_año;

    @Column(name = "pg")
    private String pg;

    @Column(name = "saldo_i")
    private Long saldo_i;

    @Column(name = "intereses")
    private Long intereses;

    @Column(name = "cuota")
    private Long cuota;

    @Column(name = "amortizacion")
    private Long amortizacion;

    @Column(name = "seg_riesgo")
    private Long seg_riesgo;

    @Column(name = "comision")
    private Long comision;

    @Column(name = "recompra")
    private Long recompra;

    @Column(name = "s_final")
    private Long s_final;

    @Column(name = "depreciacion")
    private Long depreciacion;

    @Column(name = "a_trib")
    private Long a_trib;

    @Column(name = "igv")
    private Long igv;

    @Column(name = "f_bruto")
    private Long f_bruto;

    @Column(name = "f_bruto_igv")
    private Long f_bruto_igv;

    @Column(name = "f_neto")
    private Long f_neto;


}
