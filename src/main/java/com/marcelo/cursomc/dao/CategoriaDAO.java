package com.marcelo.cursomc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.cursomc.entities.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{

	
}
