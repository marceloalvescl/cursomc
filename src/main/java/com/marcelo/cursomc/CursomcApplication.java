package com.marcelo.cursomc;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcelo.cursomc.dao.CategoriaDAO;
import com.marcelo.cursomc.entities.Categoria;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	private CategoriaDAO categoriaDAO;	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categoria cat1 = new Categoria(null, "Informática");
		 Categoria cat2 = new Categoria(null, "Escritório");
		 
		 categoriaDAO.saveAll(Arrays.asList(cat1, cat2));
	}
}
