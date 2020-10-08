package com.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
