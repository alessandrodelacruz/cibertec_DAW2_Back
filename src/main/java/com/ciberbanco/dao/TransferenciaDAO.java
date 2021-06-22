package com.ciberbanco.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.Transferencia;

@Repository
public interface TransferenciaDAO extends JpaRepository<Transferencia, Integer> {
	
	@Query(value="select * from CIBERBANCO_Transferencia where idcuentaorigen = ?1 or idcuentadestino = ?1" , nativeQuery = true)
	List<Transferencia> listarPorIdCuentaOrigen(@Param("idcuentaorigen") Integer idcuentaorigen);
}
