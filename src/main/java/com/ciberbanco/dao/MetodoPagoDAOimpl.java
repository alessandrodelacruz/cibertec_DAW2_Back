package com.ciberbanco.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciberbanco.entity.MetodoPago;

@Repository
public class MetodoPagoDAOimpl implements MetodoPagoDAO {

	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<MetodoPago> listAll() {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			query=session.createQuery("select p from CIBERBANCO_METODO_PAGO");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
}
