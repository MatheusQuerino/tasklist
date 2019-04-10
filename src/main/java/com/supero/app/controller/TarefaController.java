package com.supero.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.supero.app.model.Tarefa;
import com.supero.app.service.TarefaService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TarefaController {
	
	@Autowired
	TarefaService tarefaService;

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String teste() {
		return "API funcionando!";
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Tarefa> retornaTodasTarefas() {
		return tarefaService.consultarTodas();
	}
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public Tarefa retornaTodasTarefas(@RequestBody Long id) {
		return tarefaService.consultarPorId(id);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Tarefa salvarNovaTarefa(@RequestBody Tarefa tarefa) {
		return tarefaService.salvarTarefa(tarefa);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deletarTarefa(@RequestBody Tarefa tarefa) {
		tarefaService.deletarTarefa(tarefa.getId());
	}
	
}
