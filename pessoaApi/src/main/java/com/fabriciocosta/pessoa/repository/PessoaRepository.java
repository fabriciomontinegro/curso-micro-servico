package com.fabriciocosta.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabriciocosta.pessoa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
