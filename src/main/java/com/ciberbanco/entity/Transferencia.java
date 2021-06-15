package com.ciberbanco.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CIBERBANCO_Transferencia")
public class Transferencia implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="idcuentaorigen")
	private CuentaBancaria idcuentaorigen;

	@ManyToOne
	@JoinColumn(name="idcuentadestino")
	private CuentaBancaria idcuentadestino;
	
	@ManyToOne
	@JoinColumn(name="idmoneda")
	private Moneda idmoneda;

	@Column(name = "monto")
	private Double monto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public CuentaBancaria getIdcuentaorigen() {
		return idcuentaorigen;
	}

	public void setIdcuentaorigen(CuentaBancaria idcuentaorigen) {
		this.idcuentaorigen = idcuentaorigen;
	}

	public CuentaBancaria getIdcuentadestino() {
		return idcuentadestino;
	}

	public void setIdcuentadestino(CuentaBancaria idcuentadestino) {
		this.idcuentadestino = idcuentadestino;
	}

	public Moneda getIdmoneda() {
		return idmoneda;
	}

	public void setIdmoneda(Moneda idmoneda) {
		this.idmoneda = idmoneda;
	}

//	@Column(name = "idcuentaorigen")
//	private Integer idcuentaorigen;
	
//	@Column(name = "idcuentadestino")
//	private Integer idcuentadestino;
	
//	@Column(name = "idmoneda")
//	private Integer idmoneda;
	
	
	
	
	

}