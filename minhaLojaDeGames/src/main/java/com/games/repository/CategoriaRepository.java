package com.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
	
	
}
