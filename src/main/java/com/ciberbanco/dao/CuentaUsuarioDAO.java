package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciberbanco.entity.CuentaUsuario;
public interface CuentaUsuarioDAO extends JpaRepository<CuentaUsuario, Integer> {
	
}
