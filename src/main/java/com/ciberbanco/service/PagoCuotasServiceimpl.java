package com.ciberbanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.PagoCuotasDAO;
import com.ciberbanco.entity.PagoCuotas;

@Service
public class PagoCuotasServiceimpl implements PagoCuotasService{

	@Autowired
	private PagoCuotasDAO pagoCuotasDAO;
	
	@Override
	public void save(PagoCuotas bean) {
		// TODO Auto-generated method stub
		pagoCuotasDAO.save(bean);
	}

}
