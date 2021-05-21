package com.ciberbanco.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIBERBANCO_PRESTAMO_CUOTAS")
public class PrestamoCuotas implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "ID_PRESTAMO_CLIENTE")
	private int PrestamoCliente;
	@Column(name = "MONTO")
	private Double monto;
	@Column(name = "INTERES")
	private Double interes;
	@Column(name = "DESCUENTO")
	private Double descuento;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrestamoCliente() {
		return PrestamoCliente;
	}
	public void setPrestamoCliente(int prestamoCliente) {
		PrestamoCliente = prestamoCliente;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getInteres() {
		return interes;
	}
	public void setInteres(Double interes) {
		this.interes = interes;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	
	
}
