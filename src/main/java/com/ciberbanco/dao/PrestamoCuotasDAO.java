package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.PrestamoCuotas;

@Repository
public interface PrestamoCuotasDAO extends JpaRepository<PrestamoCuotas, Integer> {
	
}
