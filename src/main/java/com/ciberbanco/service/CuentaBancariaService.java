package com.ciberbanco.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.CuentaBancariaDAO;
import com.ciberbanco.dao.CuentaUsuarioDAO;
import com.ciberbanco.entity.CuentaBancaria;
import com.ciberbanco.entity.CuentaUsuario;
import com.ciberbanco.entity.TiposDeCambio;

@Service
public class CuentaBancariaService {

	@Autowired
	private CuentaBancariaDAO cuentaBancariaDAO;

	public List<CuentaBancaria> listAll() {
		return cuentaBancariaDAO.findAll();
	}

	public void save(CuentaBancaria bean) {
		cuentaBancariaDAO.save(bean);
	}

	public void delete(Integer cod) {
		cuentaBancariaDAO.deleteById(cod);
	}

	public Optional<CuentaBancaria> find(Integer cod) {
		return cuentaBancariaDAO.findById(cod);
	}
	
	public List<CuentaBancaria> listarPorCliente(CuentaBancaria bean) {
		return cuentaBancariaDAO.listarPorCliente(bean.getId_cliente());
	}
	
	public CuentaBancaria retornaPorNumdeCuenta(CuentaBancaria bean) {
		return cuentaBancariaDAO.retornaPorNumdeCuenta(bean.getNumero_cuenta());
	}


}
