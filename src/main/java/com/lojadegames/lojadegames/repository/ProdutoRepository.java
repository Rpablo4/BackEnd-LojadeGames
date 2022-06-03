package com.lojadegames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.lojadegames.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);
}
