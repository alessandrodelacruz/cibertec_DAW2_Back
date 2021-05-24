package com.ciberbanco.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIBERBANCO_TIPO_CUENTA")
public class TipoCuenta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer ID;

	@Column(name = "DESCRIPCION")
	private String DESCRIPCION;

	@Column(name = "ESTADO")
	private Integer ESTADO;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getDESCRIPCION() {
		return DESCRIPCION;
	}

	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}

	public Integer getESTADO() {
		return ESTADO;
	}

	public void setESTADO(Integer eSTADO) {
		ESTADO = eSTADO;
	}

	
	
	

}