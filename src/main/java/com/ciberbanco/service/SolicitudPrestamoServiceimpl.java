package com.ciberbanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberbanco.dao.SolicitudPrestamoDAO;
import com.ciberbanco.entity.SolicitudPrestamo;

@Service
public class SolicitudPrestamoServiceimpl  {
	@Autowired
	private SolicitudPrestamoDAO solicitudPrestamoDAO;

//	@Override
//	public void save(SolicitudPrestamo bean) {
//		// TODO Auto-generated method stub
//		solicitudPrestamoDAO.save(bean);
//	}

}
