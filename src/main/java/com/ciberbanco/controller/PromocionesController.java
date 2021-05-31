package com.ciberbanco.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ciberbanco.entity.Promociones;
import com.ciberbanco.service.PromocionesService;

@RestController
@RequestMapping("/promociones")
public class PromocionesController {

	@Autowired
	private PromocionesService promocionesService;

	@GetMapping("/lista")
	@ResponseBody
	public List<Promociones> lista() {
		return promocionesService.listAll();
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Promociones bean) {
		promocionesService.save(bean);
	}

//	@PostMapping("/actualizar")
//	public void actualizar(@RequestBody Promociones bean) {
//		PromocionesService.save(bean);
//	}

	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		promocionesService.delete(cod);
	}

	@GetMapping("/buscar/{codigo}")
	@ResponseBody
	public Optional<Promociones> buscar(@PathVariable("codigo") Integer cod) {
		return promocionesService.find(cod);
	}
}
