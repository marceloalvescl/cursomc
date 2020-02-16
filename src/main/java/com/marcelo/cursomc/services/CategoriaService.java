package com.marcelo.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.cursomc.dao.CategoriaDAO;
import com.marcelo.cursomc.entities.Categoria;
import com.marcelo.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaDAO dao;
	
	public List<Categoria> listarTodasCategorias() {
		List<Categoria> categorias = dao.findAll();
		
		return categorias;
	}
	
	public Categoria buscarCategoriaPorId(Integer id) throws ObjectNotFoundException{
		Optional<Categoria> categoria = dao.findById(id);
		
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}

