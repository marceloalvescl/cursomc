package com.marcelo.cursomc.resources.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.cursomc.entities.Categoria;
import com.marcelo.cursomc.services.CategoriaService;
import com.marcelo.cursomc.services.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaPathHandler {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Categoria> listarTodasCategorias() {

		List<Categoria> lista = service.listarTodasCategorias(); 

		return lista;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarCategoriaPorId(@PathVariable Integer id) {
		Categoria categoria = null;
		
		try {
			categoria = service.buscarCategoriaPorId(id);			
		}catch(ObjectNotFoundException onfe) {
			return ResponseEntity.ok().body(onfe.getMessage());
		}
		
		return ResponseEntity.ok().body(categoria);
		
	}
	
}