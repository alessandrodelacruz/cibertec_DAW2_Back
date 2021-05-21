package com.ciberbanco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.MetodoPagoDAO;
import com.ciberbanco.entity.MetodoPago;

@Service
public class MetodoPagoServiceimpl implements MetodoPagoService{
	@Autowired
	private MetodoPagoDAO metodoPagoDAO;

	@Override
	public List<MetodoPago> listAll() {
		// TODO Auto-generated method stub
		return metodoPagoDAO.listAll();
	}

}
