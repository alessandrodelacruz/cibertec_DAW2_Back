package com.ciberbanco.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.CuentaBancariaDAO;
import com.ciberbanco.dao.CuentaUsuarioDAO;
import com.ciberbanco.dao.TransferenciaDAO;
import com.ciberbanco.entity.CuentaBancaria;
import com.ciberbanco.entity.CuentaUsuario;
import com.ciberbanco.entity.TiposDeCambio;
import com.ciberbanco.entity.Transferencia;

@Service
public class TranferenciaService {

	@Autowired
	private TransferenciaDAO transferenciaDAO;

	public List<Transferencia> listAll() {
		return transferenciaDAO.findAll();
	}

	public void save(Transferencia bean) {
		transferenciaDAO.save(bean);
	}

	public List<Transferencia> listarPorIdCuentaOrigen(Transferencia bean) {
		return transferenciaDAO.listarPorIdCuentaOrigen(bean.getIdcuentaorigen().getId());
	}


}
