package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.PagoCuotas;

@Repository
public interface PagoCuotasDAO extends JpaRepository<PagoCuotas, Integer> {

}
