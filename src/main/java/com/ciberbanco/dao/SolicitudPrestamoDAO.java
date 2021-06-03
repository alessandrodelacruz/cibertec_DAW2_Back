package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.SolicitudPrestamo;

@Repository
public interface SolicitudPrestamoDAO extends JpaRepository<SolicitudPrestamo, Integer> {

}
