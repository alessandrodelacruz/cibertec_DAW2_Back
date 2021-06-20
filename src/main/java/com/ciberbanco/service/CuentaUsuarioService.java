package com.ciberbanco.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ciberbanco.dao.CuentaUsuarioDAO;
import com.ciberbanco.entity.CuentaUsuario;

@Service
public class CuentaUsuarioService {

	@Autowired
	private CuentaUsuarioDAO cuentaUsuarioDAO;

	public List<CuentaUsuario> listAll() {
		return cuentaUsuarioDAO.findAll();
	}

	public void save(CuentaUsuario bean) {
		cuentaUsuarioDAO.save(bean);
	}

	public void delete(Integer cod) {
		cuentaUsuarioDAO.deleteById(cod);
	}

	public Optional<CuentaUsuario> find(Integer cod) {
		return cuentaUsuarioDAO.findById(cod);
	}

	public CuentaUsuario listByAccount(String numero,String clave) {
		return cuentaUsuarioDAO.listar(numero, clave);
	}
}
