package com.ciberbanco.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ciberbanco.entity.PagoCuotas;
@Repository
public class PagoCuotasDAOimpl implements PagoCuotasDAO {
@Autowired
private SessionFactory factory;
	
	@Transactional
	@Override
	public void save(PagoCuotas bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
