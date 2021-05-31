package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciberbanco.entity.TiposDeCambio;

//@Repository("tipoDeCambioRepository")
//public interface TiposDeCambioDAO extends CrudRepository<TiposDeCambio, Integer>{
public interface TiposDeCambioDAO extends JpaRepository<TiposDeCambio, Integer>{

	
	
}
