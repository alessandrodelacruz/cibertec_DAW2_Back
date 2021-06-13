package com.ciberbanco.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ciberbanco.dao.TiposDeCambioDAO;
import com.ciberbanco.entity.TiposDeCambio;

@Service
public class TiposDeCambioService {
//	public class TiposDeCambioService implements TiposDeCambioServiceA{

	@Autowired
	private TiposDeCambioDAO tiposDeCambio;

	public List<TiposDeCambio> listAll() {
		return tiposDeCambio.findAll();
	}

	public TiposDeCambio save(TiposDeCambio bean) {
		try {
			return tiposDeCambio.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public TiposDeCambio actualizar(TiposDeCambio bean) {
		try {
			return tiposDeCambio.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}

	}

	public Boolean delete(Integer cod) {
		try {
			tiposDeCambio.deleteById(cod);
			Boolean resp = tiposDeCambio.existsById(cod);
			return resp;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	public Optional<TiposDeCambio> find(Integer cod) {
		return tiposDeCambio.findById(cod);
	}

	public List<TiposDeCambio> listarPorMonedaOrigen(TiposDeCambio bean) {
		return tiposDeCambio.listarPorMonedaOrigen(bean.getMoneda_origen());
	}

//	@Transactional(readOnly = true)
//	@Override
//	public List<TiposDeCambio> findAll() {
//		return (List<TiposDeCambio>)tiposDeCambio.findAll();
//	}
//
//	@Transactional
//	@Override
//	public TiposDeCambio save(TiposDeCambio tc) {
//		return tiposDeCambio.save(tc);
//	}

}
