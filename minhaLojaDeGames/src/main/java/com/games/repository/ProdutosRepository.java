package com.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
	public List<Produtos> findAllByTituloContainingIgnoreCase(String titulo);

}
