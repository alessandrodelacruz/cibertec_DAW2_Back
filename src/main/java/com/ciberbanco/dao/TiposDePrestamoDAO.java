package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.TiposDePrestamo;

@Repository
public interface TiposDePrestamoDAO extends JpaRepository<TiposDePrestamo, Integer> {

}
