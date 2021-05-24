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
@Table(name = "CIBERBANCO_CUENTA_BANCARIA")
public class CuentaBancaria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer ID;

	@Column(name = "ID_CLIENTE")
	private Integer ID_CLIENTE;

	@Column(name = "SALDO")
	private Double SALDO;

	@Column(name = "ID_MONEDA")
	private Integer ID_MONEDA;

	@Column(name = "NUMERO_CUENTA")
	private Integer NUMERO_CUENTA;

	@Column(name = "CCI")
	private String CCI;

	@Column(name = "ESTADO")
	private Integer ESTADO;

}