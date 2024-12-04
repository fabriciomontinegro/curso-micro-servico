package com.fabriciocosta.pessoa.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabriciocosta.pessoa.model.Pessoa;
import com.fabriciocosta.pessoa.repository.PessoaRepository;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {
	
	@Autowired
	private PessoaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
		List<Pessoa> listaPessoas = repository.findAll();
		return ResponseEntity.ok(listaPessoas);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> find(@PathVariable Long id) {
		Pessoa pessoa = repository.findById(id).get();
		return ResponseEntity.ok(pessoa);
	}

}
