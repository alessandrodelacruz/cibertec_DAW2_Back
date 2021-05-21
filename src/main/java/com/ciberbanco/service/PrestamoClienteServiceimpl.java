package com.ciberbanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.PrestamoClienteDAO;
import com.ciberbanco.entity.PrestamoCliente;

@Service
public class PrestamoClienteServiceimpl implements PrestamoClienteService{
	
	@Autowired
	private PrestamoClienteDAO prestamoClienteDAO;

	@Override
	public void save(PrestamoCliente bean) {
		// TODO Auto-generated method stub
		prestamoClienteDAO.save(bean);
	}

}
