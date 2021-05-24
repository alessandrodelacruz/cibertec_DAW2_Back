package com.ciberbanco.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIBERBANCO_DETALLE_PAGO")
public class DetallePago implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer ID;

	@Column(name = "ID_PAGO_CUOTAS")
	private Integer ID_PAGO_CUOTAS;

	@Column(name = "ID_CUOTA")
	private Integer ID_CUOTA;

	@Column(name = "FECHA")
	private Date FECHA;

	@Column(name = "CANTIDAD")
	private Integer CANTIDAD;

	@Column(name = "MONTO")
	private Double MONTO;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getID_PAGO_CUOTAS() {
		return ID_PAGO_CUOTAS;
	}

	public void setID_PAGO_CUOTAS(Integer iD_PAGO_CUOTAS) {
		ID_PAGO_CUOTAS = iD_PAGO_CUOTAS;
	}

	public Integer getID_CUOTA() {
		return ID_CUOTA;
	}

	public void setID_CUOTA(Integer iD_CUOTA) {
		ID_CUOTA = iD_CUOTA;
	}

	public Date getFECHA() {
		return FECHA;
	}

	public void setFECHA(Date fECHA) {
		FECHA = fECHA;
	}

	public Integer getCANTIDAD() {
		return CANTIDAD;
	}

	public void setCANTIDAD(Integer cANTIDAD) {
		CANTIDAD = cANTIDAD;
	}

	public Double getMONTO() {
		return MONTO;
	}

	public void setMONTO(Double mONTO) {
		MONTO = mONTO;
	}
	
	
	
	
	
}