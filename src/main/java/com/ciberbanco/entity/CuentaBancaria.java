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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "CIBERBANCO_CUENTA_BANCARIA")
public class CuentaBancaria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE")
	private CuentaUsuario id_cliente;

	@Column(name = "SALDO")
	private Double saldo;

	@ManyToOne
	@JoinColumn(name = "ID_MONEDA")
	private Moneda id_moneda;

	@Column(name = "NUMERO_CUENTA")
	private String numero_cuenta;

	@Column(name = "CCI")
	private String cci;

	@Column(name = "ESTADO")
	private Integer estado;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idcuentaorigen")
	private List<Transferencia> lstCuentaOrigen;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idcuentadestino")
	private List<Transferencia> lstCuentaDestino;

	public Moneda getId_moneda() {
		return id_moneda;
	}

	public void setId_moneda(Moneda id_moneda) {
		this.id_moneda = id_moneda;
	}

	public List<Transferencia> getLstCuentaOrigen() {
		return lstCuentaOrigen;
	}

	public void setLstCuentaOrigen(List<Transferencia> lstCuentaOrigen) {
		this.lstCuentaOrigen = lstCuentaOrigen;
	}

	public CuentaUsuario getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(CuentaUsuario id_cliente) {
		this.id_cliente = id_cliente;
	}

	public List<Transferencia> getLstCuentaDestino() {
		return lstCuentaDestino;
	}

	public void setLstCuentaDestino(List<Transferencia> lstCuentaDestino) {
		this.lstCuentaDestino = lstCuentaDestino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getCci() {
		return cci;
	}

	public void setCci(String cci) {
		this.cci = cci;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	

}