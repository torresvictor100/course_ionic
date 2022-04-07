package com.curso.ionic.curso.ionic.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ionic.curso.ionic.domain.Categoria;
import com.curso.ionic.curso.ionic.repositories.CategoriaRepository;
import com.curso.ionic.curso.ionic.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

	public List<Categoria> findAll() {
		return repo.findAll();
	}

}
