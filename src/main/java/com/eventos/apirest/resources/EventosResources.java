package com.eventos.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventos.apirest.models.Evento;
import com.eventos.apirest.repository.EventosRepository;

@RestController
@RequestMapping(value="/api")
public class EventosResources<Eventos> {
	
	@Autowired
	EventosRepository eventosRepository;	
	
	@GetMapping("/eventos")
	public List<Evento> listaEventos(){
		return eventosRepository.findAll();
	
	}
	
	@GetMapping("/evento/{id}")
	public Optional<Evento> listaEventounico(@PathVariable(value="id")Long id){
		return eventosRepository.findById(id);
	}
	
	@PostMapping("/evento")
	public Evento salvaEvento(@RequestBody Evento evento){
		return eventosRepository.save(evento);
	}
	
	@DeleteMapping("/evento")
	public void deleteEvento(@RequestBody Evento evento){
		eventosRepository.delete(evento);
		
	
	}
	
	@PutMapping("/evento")
	public Evento atualizaEvento(@RequestBody Evento evento){
		return eventosRepository.save(evento);
	
		
	}



	
	

}