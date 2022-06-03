package com.lojadegames.lojadegames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojadegames.lojadegames.model.CategoriaModel;
import com.lojadegames.lojadegames.repository.CategoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<Optional<CategoriaModel>> getById(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id));
	}
	@GetMapping("/{nome}")
	public ResponseEntity<List<CategoriaModel>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	@PostMapping
	public ResponseEntity<CategoriaModel> createCategoria(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	@PutMapping
	public ResponseEntity<CategoriaModel> updateCategoria(@RequestBody CategoriaModel Categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(Categoria));
	}
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable long id) {
		repository.deleteById(id);;
	}
}
