package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.CuentaUsuario;

@Repository
public interface CuentaUsuarioDAO extends JpaRepository<CuentaUsuario, Integer> {

}
