package com.ciberbanco.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class _Respuesta {

	private Integer estado;
	private String msg;
	private String token;
	private String page;
	private Integer cantidad;
	private String accion;
	private Integer iduser;
	private String pass;	
	Object defaultObj;	
	List<? extends Object> aaData;
	
	private String numerotarjeta;
	private String clave;
	private String cuentabancaria;
	
	
	public String getNumerotarjeta() {
		return numerotarjeta;
	}
	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCuentabancaria() {
		return cuentabancaria;
	}
	public void setCuentabancaria(String cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public Integer getIduser() {
		return iduser;
	}
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Object getDefaultObj() {
		return defaultObj;
	}
	public void setDefaultObj(Object defaultObj) {
		this.defaultObj = defaultObj;
	}
	public List<? extends Object> getAaData() {
		return aaData;
	}
	public void setAaData(List<? extends Object> aaData) {
		this.aaData = aaData;
	}
	
	
	

	
	



}
