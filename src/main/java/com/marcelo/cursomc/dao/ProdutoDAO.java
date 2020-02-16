package com.marcelo.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.cursomc.entities.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer>{
	
}
