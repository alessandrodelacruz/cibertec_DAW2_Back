package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.TiposDeCambio;

@Repository
public interface TiposDeCambioDAO extends JpaRepository<TiposDeCambio, Integer> {

}
