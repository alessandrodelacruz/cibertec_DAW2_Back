package com.ciberbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciberbanco.entity.Promociones;

@Repository
public interface PromocionesDAO extends JpaRepository<Promociones, Integer> {

}
