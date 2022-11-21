package com.leaseit.leasing.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="operacion")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnoreProperties( {"hibernateLazyInitializer", "handler"})
	private User user;
	
	@ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnoreProperties ( {"hibernateLazyInitializer", "handler"})
	private Arrendador arrendador;
	
	@ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnoreProperties ( {"hibernateLazyInitializer", "handler"})
	private Activo activo;
	
	@ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnoreProperties ( {"hibernateLazyInitializer", "handler"})
	private Activo TEP;
	
    private String moneda;
    
    private Long number;
    
    private Long amortizacion; 
    
    private boolean p_incluido;
    
    private Long p_gracia;

    private Long n_ptype;
    
    private String p_type;

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

	public Arrendador getArrendador() {
		return arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public Activo getTEP() {
		return TEP;
	}

	public void setTEP(Activo tEP) {
		TEP = tEP;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(Long amortizacion) {
		this.amortizacion = amortizacion;
	}

	public boolean isP_incluido() {
		return p_incluido;
	}

	public void setP_incluido(boolean p_incluido) {
		this.p_incluido = p_incluido;
	}

	public Long getP_gracia() {
		return p_gracia;
	}

	public void setP_gracia(Long p_gracia) {
		this.p_gracia = p_gracia;
	}

	public Long getN_ptype() {
		return n_ptype;
	}

	public void setN_ptype(Long n_ptype) {
		this.n_ptype = n_ptype;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", user=" + user + ", arrendador=" + arrendador + ", activo=" + activo + ", TEP="
				+ TEP + ", moneda=" + moneda + ", number=" + number + ", amortizacion=" + amortizacion + ", p_incluido="
				+ p_incluido + ", p_gracia=" + p_gracia + ", n_ptype=" + n_ptype + ", p_type=" + p_type + "]";
	}

	public Operation(Long id, User user, Arrendador arrendador, Activo activo, Activo tEP, String moneda, Long number,
			Long amortizacion, boolean p_incluido, Long p_gracia, Long n_ptype, String p_type) {
		super();
		this.id = id;
		this.user = user;
		this.arrendador = arrendador;
		this.activo = activo;
		TEP = tEP;
		this.moneda = moneda;
		this.number = number;
		this.amortizacion = amortizacion;
		this.p_incluido = p_incluido;
		this.p_gracia = p_gracia;
		this.n_ptype = n_ptype;
		this.p_type = p_type;
	}

	public Operation() {

	}

   
}
