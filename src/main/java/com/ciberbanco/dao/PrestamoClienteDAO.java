package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.PrestamoCliente;

@Repository
public interface PrestamoClienteDAO extends JpaRepository<PrestamoCliente, Integer> {

}
