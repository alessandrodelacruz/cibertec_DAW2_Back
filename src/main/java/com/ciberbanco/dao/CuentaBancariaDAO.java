package com.ciberbanco.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.CuentaBancaria;
import com.ciberbanco.entity.TiposDeCambio;

@Repository
public interface CuentaBancariaDAO extends JpaRepository<CuentaBancaria, Integer> {
	
	@Query(value="select * from CIBERBANCO_CUENTA_BANCARIA  where id_cliente = ?1", nativeQuery = true)
	List<CuentaBancaria> listarPorCliente(@Param("id_cliente") Integer id_cliente);
	
	@Query(value="select * from CIBERBANCO_CUENTA_BANCARIA  where numero_cuenta = ?1", nativeQuery = true)
	CuentaBancaria retornaPorNumdeCuenta(@Param("numero_cuenta") String numero_cuenta);
	
	


}
