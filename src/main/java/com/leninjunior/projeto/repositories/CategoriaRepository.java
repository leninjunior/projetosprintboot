package com.leninjunior.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leninjunior.projeto.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	/* Objeto CategoriaRepository terá o poder de fazer as operações salvar, deletar e etc...*/

	
}
