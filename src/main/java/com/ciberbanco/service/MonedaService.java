package com.ciberbanco.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.MonedaDAO;
import com.ciberbanco.dao.TiposDeCambioDAO;
import com.ciberbanco.entity.Moneda;
import com.ciberbanco.entity.TiposDeCambio;

@Service
public class MonedaService {

	@Autowired
	private MonedaDAO monedaDAO;

	public List<Moneda> listAll() {
		return monedaDAO.findAll();
	}


}
