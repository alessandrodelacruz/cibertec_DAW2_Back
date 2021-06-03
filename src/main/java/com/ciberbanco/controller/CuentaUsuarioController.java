package com.ciberbanco.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ciberbanco.entity.CuentaUsuario;
import com.ciberbanco.service.CuentaUsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cuentaUsuario")
public class CuentaUsuarioController {

	@Autowired
	private CuentaUsuarioService cuentaUsuarioService;

	@GetMapping("/lista")
	@ResponseBody
	public List<CuentaUsuario> lista() {
		return cuentaUsuarioService.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody CuentaUsuario bean) {
		cuentaUsuarioService.save(bean);
	}

	@PostMapping("/actualizar")
	public void actualizar(@RequestBody CuentaUsuario bean) {
		cuentaUsuarioService.save(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		cuentaUsuarioService.delete(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<CuentaUsuario> buscar(@PathVariable("codigo") Integer cod) {
		return cuentaUsuarioService.find(cod);
	}
}
