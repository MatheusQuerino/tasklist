package com.supero.app.service;

import java.util.List;

import com.supero.app.model.Tarefa;

public interface TarefaService {

	List<Tarefa> consultarTodas();

	Tarefa salvarTarefa(Tarefa entity);

	Tarefa consultarPorId(Long id);

	void deletarTarefa(Long id);

}
