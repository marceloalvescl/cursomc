package com.marcelo.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.cursomc.dao.ProdutoDAO;
import com.marcelo.cursomc.entities.Produto;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoDAO dao;

	public List<Produto> listarTodosProdutos() {
		List<Produto> produtos = dao.findAll();

		return produtos;
	}

	public Produto buscarProdutoPorId(Integer id) {
		Optional<Produto> produto = dao.findById(id);

		return produto.orElse(null);
	}

}
