package com.leaseit.leasing.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="operacion")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private User user;

	@OneToOne
	private Activo activo;

	@OneToOne
	private Arrendador arrendador;

	@Column(name = "pgp_flag")
	private boolean pgp_flag;

	@Column(name = "pgp_count")
	private Long pgp_count;

	@Column(name = "pgt_flag")
	private boolean pgt_flag;

	@Column(name = "pgt_count")
	private Long pgt_count;

	@Column(name = "p_financiado")
	private Long p_financiado;

	@Column(name = "tiempo_o")
	private Long tiempo_o;

	@Column(name = "frecuencia_p")
	private Long frecuencia;

	@Column(name="moneda")
	private String moneda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public Arrendador getArrendador() {
		return arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

	public boolean isPgp_flag() {
		return pgp_flag;
	}

	public void setPgp_flag(boolean pgp_flag) {
		this.pgp_flag = pgp_flag;
	}

	public Long getPgp_count() {
		return pgp_count;
	}

	public void setPgp_count(Long pgp_count) {
		this.pgp_count = pgp_count;
	}

	public boolean isPgt_flag() {
		return pgt_flag;
	}

	public void setPgt_flag(boolean pgt_flag) {
		this.pgt_flag = pgt_flag;
	}

	public Long getPgt_count() {
		return pgt_count;
	}

	public void setPgt_count(Long pgt_count) {
		this.pgt_count = pgt_count;
	}

	public Long getP_financiado() {
		return p_financiado;
	}

	public void setP_financiado(Long p_financiado) {
		this.p_financiado = p_financiado;
	}

	public Long getTiempo_o() {
		return tiempo_o;
	}

	public void setTiempo_o(Long tiempo_o) {
		this.tiempo_o = tiempo_o;
	}

	public Long getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Long frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Operation(User user, Activo activo, Arrendador arrendador, boolean pgp_flag, Long pgp_count, boolean pgt_flag, Long pgt_count, Long p_financiado, Long tiempo_o, Long frecuencia, String moneda) {
		this.user = user;
		this.activo = activo;
		this.arrendador = arrendador;
		this.pgp_flag = pgp_flag;
		this.pgp_count = pgp_count;
		this.pgt_flag = pgt_flag;
		this.pgt_count = pgt_count;
		this.p_financiado = p_financiado;
		this.tiempo_o = tiempo_o;
		this.frecuencia = frecuencia;
		this.moneda = moneda;
	}

	public Operation(){

	}

	@Override
	public String toString() {
		return "Operation{" +
				"id=" + id +
				", user=" + user +
				", activo=" + activo +
				", arrendador=" + arrendador +
				", pgp_flag=" + pgp_flag +
				", pgp_count='" + pgp_count + '\'' +
				", pgt_flag=" + pgt_flag +
				", pgt_count='" + pgt_count + '\'' +
				", p_financiado=" + p_financiado +
				", tiempo_o=" + tiempo_o +
				", frecuencia=" + frecuencia +
				", moneda='" + moneda + '\'' +
				'}';
	}
}
