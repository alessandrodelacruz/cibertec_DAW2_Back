package com.ciberbanco.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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
	
	@Transactional
	@Modifying
	@Query(value="update CIBERBANCO_CUENTA_BANCARIA  set SALDO = ?1 where ID = ?2", nativeQuery = true)
	public abstract void actualizarSaldoOrigen(@Param("saldo") Double saldo, @Param("idcuenta") Integer idcuenta );
	
	@Transactional
	@Modifying
	@Query(value="update CIBERBANCO_CUENTA_BANCARIA  set SALDO = ?1 where ID = ?2", nativeQuery = true)
	public abstract void actualizarSaldoDestino(@Param("saldo") Double saldo, @Param("idcuenta") Integer idcuenta );
	
	


}
