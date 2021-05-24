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
@Table(name = "CIBERBANCO_CUENTA_USUARIO")
public class CuentaUsuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer ID;

	@Column(name = "EMAIL")
	private String EMAIL;

	@Column(name = "TIPO_DE_CUENTA")
	private Integer TIPO_DE_CUENTA;

	@Column(name = "FECHA_NAC")
	private Date FECHA_NAC;

	@Column(name = "SEXO")
	private Integer SEXO;

	@Column(name = "DIRECCION")
	private String DIRECCION;

	@Column(name = "ESTADO")
	private Integer ESTADO;

	@Column(name = "ID_DISTRITO")
	private Integer ID_DISTRITO;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public Integer getTIPO_DE_CUENTA() {
		return TIPO_DE_CUENTA;
	}

	public void setTIPO_DE_CUENTA(Integer tIPO_DE_CUENTA) {
		TIPO_DE_CUENTA = tIPO_DE_CUENTA;
	}

	public Date getFECHA_NAC() {
		return FECHA_NAC;
	}

	public void setFECHA_NAC(Date fECHA_NAC) {
		FECHA_NAC = fECHA_NAC;
	}

	public Integer getSEXO() {
		return SEXO;
	}

	public void setSEXO(Integer sEXO) {
		SEXO = sEXO;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public Integer getESTADO() {
		return ESTADO;
	}

	public void setESTADO(Integer eSTADO) {
		ESTADO = eSTADO;
	}

	public Integer getID_DISTRITO() {
		return ID_DISTRITO;
	}

	public void setID_DISTRITO(Integer iD_DISTRITO) {
		ID_DISTRITO = iD_DISTRITO;
	}


	
	

}