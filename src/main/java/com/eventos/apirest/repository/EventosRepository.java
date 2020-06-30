package com.eventos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.apirest.models.Evento;

public interface EventosRepository extends JpaRepository<Evento, Long>{
	
	
	<Produto> Produto findById(Long id);
	

}
