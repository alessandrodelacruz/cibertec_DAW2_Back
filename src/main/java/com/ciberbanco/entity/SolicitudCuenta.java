package com.ciberbanco.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIBERBANCO_SOLICITUD_CUENTA")
public class SolicitudCuenta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer ID;

	@Column(name = "ID_CLIENTE")
	private Integer ID_CLIENTE;

	@Column(name = "ID_TIPO_CUENTA")
	private Integer ID_TIPO_CUENTA;

	@Column(name = "FECHA_SOLICITUD")
	private Date FECHA_SOLICITUD;

	@Column(name = "NOTA")
	private String NOTA;

	@Column(name = "ORIGEN")
	private String ORIGEN;

	@Column(name = "ESTADO")
	private Integer ESTADO;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getID_CLIENTE() {
		return ID_CLIENTE;
	}

	public void setID_CLIENTE(Integer iD_CLIENTE) {
		ID_CLIENTE = iD_CLIENTE;
	}

	public Integer getID_TIPO_CUENTA() {
		return ID_TIPO_CUENTA;
	}

	public void setID_TIPO_CUENTA(Integer iD_TIPO_CUENTA) {
		ID_TIPO_CUENTA = iD_TIPO_CUENTA;
	}

	public Date getFECHA_SOLICITUD() {
		return FECHA_SOLICITUD;
	}

	public void setFECHA_SOLICITUD(Date fECHA_SOLICITUD) {
		FECHA_SOLICITUD = fECHA_SOLICITUD;
	}

	public String getNOTA() {
		return NOTA;
	}

	public void setNOTA(String nOTA) {
		NOTA = nOTA;
	}

	public String getORIGEN() {
		return ORIGEN;
	}

	public void setORIGEN(String oRIGEN) {
		ORIGEN = oRIGEN;
	}

	public Integer getESTADO() {
		return ESTADO;
	}

	public void setESTADO(Integer eSTADO) {
		ESTADO = eSTADO;
	}

	
	
	

}