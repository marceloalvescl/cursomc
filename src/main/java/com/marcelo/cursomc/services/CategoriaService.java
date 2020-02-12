package com.marcelo.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.cursomc.dao.CategoriaDAO;
import com.marcelo.cursomc.entities.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDAO dao;
	
	public List<Categoria> listarTodasCategorias() {
		List<Categoria> categorias = dao.findAll();
		
		return categorias;
	}
	
	public Categoria buscarCategoriaPorId(Integer id) {
		Optional<Categoria> categoria = dao.findById(id);
		
		return categoria.orElse(null);
		
	}
	
}

