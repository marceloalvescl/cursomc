package com.marcelo.cursomc.paths;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.cursomc.entities.Produto;
import com.marcelo.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Produto> listarTodosProdutos() {

		List<Produto> lista = service.listarTodosProdutos(); 

		return lista;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarProdutoPorId(@PathVariable Integer id) {
		
		Produto produto = service.buscarProdutoPorId(id);
		
		return ResponseEntity.ok().body(produto);
		
	}
		
	
}
