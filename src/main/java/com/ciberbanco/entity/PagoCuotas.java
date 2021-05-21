package com.ciberbanco.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "CIBERBANCO_PAGO_CUOTAS")
public class PagoCuotas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "ID_PRESTAMO_CUOTAS")
	private int PrestamoCuota;
	@Column(name = "ID_CLIENTE")
	private int IdCliente;
	@Column(name = "FECHA_PAGO")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column(name = "SUBTOTAL")
	private Double subtotal;
	@Column(name = "ID_METODO_PAGO")
	private int MetodoPago;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrestamoCuota() {
		return PrestamoCuota;
	}
	public void setPrestamoCuota(int prestamoCuota) {
		PrestamoCuota = prestamoCuota;
	}
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public int getMetodoPago() {
		return MetodoPago;
	}
	public void setMetodoPago(int metodoPago) {
		MetodoPago = metodoPago;
	}
	
	
	
}
