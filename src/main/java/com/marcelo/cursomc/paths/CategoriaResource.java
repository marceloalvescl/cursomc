package com.marcelo.cursomc.paths;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.cursomc.entities.Categoria;
import com.marcelo.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Categoria> listarTodasCategorias() {

		List<Categoria> lista = service.listarTodasCategorias(); 

		return lista;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarCategoriaPorId(@PathVariable Integer id) {
		
		Categoria categoria = service.buscarCategoriaPorId(id);
		
		return ResponseEntity.ok().body(categoria);
		
	}
	
}