package com.ciberbanco.entity;

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
@Table(name = "CIBERBANCO_PRESTAMO_CLIENTE")
public class PrestamoCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "MONTO")
	private Double monto;
	@Column(name = "PLAZO_MESES")
	private int plazo;
	@Column(name = "FECHA_INICIO")
	@Temporal(TemporalType.DATE)
	private Date inicio;
	@Column(name = "FECHA_FIN")
	@Temporal(TemporalType.DATE)
	private Date fin;
	@Column(name = "ID_SOLICITUD")
	private int solicitud;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public int getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(int solicitud) {
		this.solicitud = solicitud;
	}
	
	
	
}
