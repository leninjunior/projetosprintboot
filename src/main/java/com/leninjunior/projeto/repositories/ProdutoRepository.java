package com.leninjunior.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leninjunior.projeto.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	/* Objeto ProdutoRepository terá o poder de fazer as operações salvar, deletar e etc...*/

	
}
