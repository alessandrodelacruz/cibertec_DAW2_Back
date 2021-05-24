package com.ciberbanco.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIBERBANCO_TARJETA")
public class Tarjeta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer ID;

	@Column(name = "ID_CUENTA_BANCARIA")
	private Integer ID_CUENTA_BANCARIA;

	@Column(name = "NUMERO_TARJETA")
	private String NUMERO_TARJETA;

	@Column(name = "CCV")
	private String CCV;

	@Column(name = "CLAVE")
	private String CLAVE;

	@Column(name = "ESTADO")
	private Integer ESTADO;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getID_CUENTA_BANCARIA() {
		return ID_CUENTA_BANCARIA;
	}

	public void setID_CUENTA_BANCARIA(Integer iD_CUENTA_BANCARIA) {
		ID_CUENTA_BANCARIA = iD_CUENTA_BANCARIA;
	}

	public String getNUMERO_TARJETA() {
		return NUMERO_TARJETA;
	}

	public void setNUMERO_TARJETA(String nUMERO_TARJETA) {
		NUMERO_TARJETA = nUMERO_TARJETA;
	}

	public String getCCV() {
		return CCV;
	}

	public void setCCV(String cCV) {
		CCV = cCV;
	}

	public Integer getESTADO() {
		return ESTADO;
	}

	public void setESTADO(Integer eSTADO) {
		ESTADO = eSTADO;
	}
	
	
	
	
	
	

}