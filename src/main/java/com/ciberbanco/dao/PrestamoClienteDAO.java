package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciberbanco.entity.PrestamoCliente;

//public interface PrestamoClienteDAO {
public interface PrestamoClienteDAO extends JpaRepository<PrestamoCliente, Integer> {

}
