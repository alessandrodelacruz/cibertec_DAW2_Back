package com.ciberbanco.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class _EntityGlobal {

	private CuentaBancaria cuentaBancaria;
	private CuentaUsuario  cuentaUsuario;
	
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public CuentaUsuario getCuentaUsuario() {
		return cuentaUsuario;
	}
	public void setCuentaUsuario(CuentaUsuario cuentaUsuario) {
		this.cuentaUsuario = cuentaUsuario;
	}
	

	
	



}
