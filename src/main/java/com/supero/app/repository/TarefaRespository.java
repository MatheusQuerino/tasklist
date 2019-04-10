package com.supero.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.supero.app.model.Tarefa;

@Repository
public interface TarefaRespository extends JpaRepository<Tarefa, Long> {
	
	@Nullable
	public List<Tarefa> findAllByDataRemocaoIsNull();


}
