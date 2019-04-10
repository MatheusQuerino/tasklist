package com.supero.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supero.app.model.Tarefa;
import com.supero.app.repository.TarefaRespository;

@Service
public class TarefaServiceImpl implements TarefaService {

	@Autowired
	TarefaRespository repository;
	
	@Override
	public List<Tarefa> consultarTodas() {
		return (List<Tarefa>) repository.findAllByDataRemocaoIsNull();
	}
	
	@Override
	public Tarefa salvarTarefa(Tarefa entity) {
		return repository.save(entity);
	}
	
	@Override
	public Tarefa consultarPorId(Long id) {
		return repository.findById(id).get();
	}
	
	@Override
	public void deletarTarefa(Long id) {
		repository.deleteById(id);
	}
}
