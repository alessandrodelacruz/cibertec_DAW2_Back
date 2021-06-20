package com.ciberbanco.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "CIBERBANCO_MONEDAS")
public class Moneda implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private int id;

	@Column(name = "MONEDA")
	private String moneda;

	@Column(name = "simbolo")
	private String simbolo;
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	@JsonIgnore
	@OneToMany(mappedBy = "moneda_origen")
	private List<TiposDeCambio> tiposDeCambioo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "moneda_destino")
	private List<TiposDeCambio> tiposDeCambiod;

	@JsonIgnore
	@OneToMany(mappedBy = "moneda", fetch = FetchType.LAZY)
	private List<TiposDePrestamo> tiposDePrestamo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idmoneda")
	private List<Transferencia> lstTransferencia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public List<TiposDeCambio> getTiposDeCambioo() {
		return tiposDeCambioo;
	}

	public void setTiposDeCambioo(List<TiposDeCambio> tiposDeCambioo) {
		this.tiposDeCambioo = tiposDeCambioo;
	}

	public List<TiposDeCambio> getTiposDeCambiod() {
		return tiposDeCambiod;
	}

	public void setTiposDeCambiod(List<TiposDeCambio> tiposDeCambiod) {
		this.tiposDeCambiod = tiposDeCambiod;
	}

	public List<TiposDePrestamo> getTiposDePrestamo() {
		return tiposDePrestamo;
	}

	public void setTiposDePrestamo(List<TiposDePrestamo> tiposDePrestamo) {
		this.tiposDePrestamo = tiposDePrestamo;
	}



}
