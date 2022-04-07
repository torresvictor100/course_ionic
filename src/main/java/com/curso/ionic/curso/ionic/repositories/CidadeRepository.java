package com.curso.ionic.curso.ionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.ionic.curso.ionic.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>  {

}
