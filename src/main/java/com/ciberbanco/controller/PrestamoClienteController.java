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
import com.ciberbanco.entity.PrestamoCliente;
import com.ciberbanco.service.PrestamoClienteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/prestamoCliente")
public class PrestamoClienteController {

	@Autowired
	private PrestamoClienteService prestamoClienteService;

	@GetMapping("/lista")
	@ResponseBody
	public List<PrestamoCliente> lista() {
		return prestamoClienteService.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody PrestamoCliente bean) {
		prestamoClienteService.save(bean);
	}

	@PostMapping("/actualizar")
	public void actualizar(@RequestBody PrestamoCliente bean) {
		prestamoClienteService.save(bean);
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		prestamoClienteService.delete(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<PrestamoCliente> buscar(@PathVariable("codigo") Integer cod) {
		return prestamoClienteService.find(cod);
	}
}
