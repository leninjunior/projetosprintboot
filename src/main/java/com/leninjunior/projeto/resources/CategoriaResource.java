package com.leninjunior.projeto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leninjunior.projeto.domain.Categoria;
import com.leninjunior.projeto.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	@RequestMapping( value = "{id}", method= RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){ /*PathVariable para ele entender que é o mesmo ID */
	
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
			
		
	}

}
