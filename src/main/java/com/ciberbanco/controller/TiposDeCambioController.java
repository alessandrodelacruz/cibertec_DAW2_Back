package com.ciberbanco.controller;

import java.util.ArrayList;
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
import com.ciberbanco.entity.TiposDeCambio;
import com.ciberbanco.service.TiposDeCambioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipodecambio")
public class TiposDeCambioController {

	@Autowired
	private TiposDeCambioService tiposDeCambioService;

	@GetMapping("/lista")
	@ResponseBody
	public List<TiposDeCambio> lista() {
		List objtList = new ArrayList<>();
		try {
			objtList = tiposDeCambioService.listAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return objtList;
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody TiposDeCambio bean) {
		try {
			tiposDeCambioService.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@PostMapping("/actualizar")
	public void actualizar(@RequestBody TiposDeCambio bean) {
		try {
			tiposDeCambioService.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		try {
			tiposDeCambioService.delete(cod);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<TiposDeCambio> buscar(@PathVariable("codigo") Integer cod) {
		return tiposDeCambioService.find(cod);
	}

}
