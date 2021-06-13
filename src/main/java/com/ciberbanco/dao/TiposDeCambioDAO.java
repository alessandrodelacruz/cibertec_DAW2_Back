package com.ciberbanco.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.TiposDeCambio;

@Repository
public interface TiposDeCambioDAO extends JpaRepository<TiposDeCambio, Integer> {
	
	@Query(value="select * from CIBERBANCO_TIPOS_DE_CAMBIO t where moneda_origen = ?1", nativeQuery = true)
	List<TiposDeCambio> listarPorMonedaOrigen(@Param("idmoneda") Integer idmoneda);

}
