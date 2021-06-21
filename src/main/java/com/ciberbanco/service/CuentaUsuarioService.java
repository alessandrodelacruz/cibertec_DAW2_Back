package com.ciberbanco.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.CuentaBancariaDAO;
import com.ciberbanco.dao.CuentaUsuarioDAO;
import com.ciberbanco.entity.CuentaBancaria;
import com.ciberbanco.entity.CuentaUsuario;
import com.ciberbanco.entity._EntityGlobal;
import com.ciberbanco.entity._Respuesta;

@Service
public class CuentaUsuarioService {

	@Autowired
	private CuentaUsuarioDAO cuentaUsuarioDAO;
	
	@Autowired
	private CuentaBancariaDAO cuentaBancariaDAO;

	public List<CuentaUsuario> listAll() {
		return cuentaUsuarioDAO.findAll();
	}
	
	
	public _EntityGlobal guardarUsuarioNuevo(_EntityGlobal bean) {
		_EntityGlobal objglobal = new _EntityGlobal();
		CuentaUsuario cu = bean.getCuentaUsuario();
		String numerotarjeta = generaNumTarjeta();
		cu.setNumerotarjeta(numerotarjeta);
		cuentaUsuarioDAO.save(cu);
		
		CuentaBancaria cb = bean.getCuentaBancaria();
		String numerocuenta = generaNumCuentaBancaria();
		cb.setNumero_cuenta(numerocuenta);
		cb.setSaldo(0.00);
		cb.setId_cliente(cu);
		cuentaBancariaDAO.save(cb);
		
		objglobal.setCuentaBancaria(cb);
		objglobal.setCuentaUsuario(cu);
		
		return objglobal;
	}	

	public void save(CuentaUsuario bean) {
		cuentaUsuarioDAO.save(bean);
	}

	public void delete(Integer cod) {
		cuentaUsuarioDAO.deleteById(cod);
	}

	public Optional<CuentaUsuario> find(Integer cod) {
		return cuentaUsuarioDAO.findById(cod);
	}
	
	public String generaNumTarjeta() {
		Random r = new Random();
		String random = "";
		String alphabet = "0123456789";
		for (int i = 0; i < 15; i++) {
			random += alphabet.charAt(r.nextInt(alphabet.length()));
		}
		return random;
	}
	
	public String generaNumCuentaBancaria() {
		Random r = new Random();
		String random = "";
		String alphabet = "0123456789";
		for (int i = 0; i < 10; i++) {
			random += alphabet.charAt(r.nextInt(alphabet.length()));
		}
		return random;
	}

	public CuentaUsuario listByAccount(String numero,String clave) {
		return cuentaUsuarioDAO.listar(numero, clave);
	}
}
