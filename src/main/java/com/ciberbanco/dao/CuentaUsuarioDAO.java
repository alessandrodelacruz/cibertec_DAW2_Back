package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.CuentaUsuario;

@Repository
public interface CuentaUsuarioDAO extends JpaRepository<CuentaUsuario, Integer> {

	@Query(value = "{call SP_Validar_Cuenta(:numero,:clave)}",nativeQuery = true)
	public CuentaUsuario listar(@Param("numero") String numero,
							 @Param("clave") String clave);
	
}
