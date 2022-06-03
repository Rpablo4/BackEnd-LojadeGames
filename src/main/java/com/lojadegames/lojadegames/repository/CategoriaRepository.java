package com.lojadegames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.lojadegames.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	public List<CategoriaModel> findAllByNomeContainingIgnoreCase(String nome);
}
