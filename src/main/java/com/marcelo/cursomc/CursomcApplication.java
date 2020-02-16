package com.marcelo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcelo.cursomc.dao.CategoriaDAO;
import com.marcelo.cursomc.dao.ProdutoDAO;
import com.marcelo.cursomc.entities.Categoria;
import com.marcelo.cursomc.entities.Produto;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaDAO categoriaDAO;
	@Autowired
	private ProdutoDAO produtoDAO;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categoria cat1 = new Categoria(null, "Informática");
 		 Categoria cat2 = new Categoria(null, "Escritório");
 		 
 		 Produto prod1 = new Produto(null, "Computador", 2000.00);
 		 Produto prod2 = new Produto(null, "Impressora", 800.00);
 		 Produto prod3 = new Produto(null, "Mouse", 80.00);
		 
		 cat1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
		 cat2.getProdutos().addAll(Arrays.asList(prod2));
		 
		 prod1.getCategorias().addAll(Arrays.asList(cat1));
		 prod2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		 prod3.getCategorias().addAll(Arrays.asList(cat1));
		 
		 categoriaDAO.saveAll(Arrays.asList(cat1, cat2));
		 produtoDAO.saveAll(Arrays.asList(prod1, prod2, prod3));
	}
}
