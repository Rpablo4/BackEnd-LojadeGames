package com.lojadegames.lojadegames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadegames.lojadegames.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>{
	public Optional<UsuarioModel> findByEmail(String email);
}
