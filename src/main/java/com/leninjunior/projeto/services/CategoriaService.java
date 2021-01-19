package com.leninjunior.projeto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leninjunior.projeto.domain.Categoria;
import com.leninjunior.projeto.repositories.CategoriaRepository;
import com.leninjunior.projeto.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired  /*Spring tratará todo o ciclo de vida (Instanciar, utilizar e destruir)*/
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

		}
	
	
	

		
	}



