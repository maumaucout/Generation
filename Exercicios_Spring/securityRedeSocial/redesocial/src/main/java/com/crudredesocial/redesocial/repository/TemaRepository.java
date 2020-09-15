package com.crudredesocial.redesocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudredesocial.redesocial.model.Tema;


public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
