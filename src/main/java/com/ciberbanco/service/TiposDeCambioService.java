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

	public void save(TiposDeCambio bean) {
		tiposDeCambio.save(bean);
	}

	public void delete(Integer cod) {
		tiposDeCambio.deleteById(cod);
	}

	public Optional<TiposDeCambio> find(Integer cod) {
		return tiposDeCambio.findById(cod);
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
