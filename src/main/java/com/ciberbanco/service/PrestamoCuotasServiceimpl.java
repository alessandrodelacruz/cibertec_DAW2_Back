package com.ciberbanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.PrestamoCuotasDAO;
import com.ciberbanco.entity.PrestamoCuotas;

@Service
public class PrestamoCuotasServiceimpl implements PrestamoCuotasService{
	@Autowired
	private PrestamoCuotasDAO prestamoCuotasDAO;

	@Override
	public void save(PrestamoCuotas bean) {
		// TODO Auto-generated method stub
		prestamoCuotasDAO.save(bean);
	}

}
