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

	@Autowired
	private CuentaBancariaDAO cuentaBancariaDAO;

	public List<Transferencia> listAll() {
		return transferenciaDAO.findAll();
	}

	public void save(Transferencia bean) {

		transferenciaDAO.save(bean);
		
		Double saldoorigen = bean.getIdcuentaorigen().getSaldo() - bean.getMonto();
		cuentaBancariaDAO.actualizarSaldoOrigen(saldoorigen, bean.getIdcuentaorigen().getId());

		Double saldodestino = bean.getIdcuentadestino().getSaldo() + bean.getMonto();
		cuentaBancariaDAO.actualizarSaldoDestino(saldodestino, bean.getIdcuentadestino().getId());
	}

	public List<Transferencia> listarPorIdCuentaOrigen(Transferencia bean) {
		return transferenciaDAO.listarPorIdCuentaOrigen(bean.getIdcuentaorigen().getId());
	}

}
