package com.ciberbanco.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CIBERBANCO_TIPOS_DE_CAMBIO")
public class TiposDeCambio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private int id;

//	@Column(name = "MONEDA_ORIGEN")
//	private int moneda_origen;
//
//	@Column(name = "MONEDA_DESTINO")
//	private int moneda_destino;

	@Column(name = "TIPO_CAMBIO")
	private double tipo_cambio;

	@Column(name = "FECHA_CAMBIO")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "MONEDA_ORIGEN")
	private Moneda moneda_origen;

	@ManyToOne
	@JoinColumn(name = "MONEDA_DESTINO")
	private Moneda moneda_destino;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(double tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Moneda getMoneda_origen() {
		return moneda_origen;
	}

	public void setMoneda_origen(Moneda moneda_origen) {
		this.moneda_origen = moneda_origen;
	}

	public Moneda getMoneda_destino() {
		return moneda_destino;
	}

	public void setMoneda_destino(Moneda moneda_destino) {
		this.moneda_destino = moneda_destino;
	}
	
	
	

}
