package com.curso.ionic.curso.ionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ionic.curso.ionic.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>  {

}
