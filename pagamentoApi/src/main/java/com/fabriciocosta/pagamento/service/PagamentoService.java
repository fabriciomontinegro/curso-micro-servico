package com.fabriciocosta.pagamento.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fabriciocosta.pagamento.model.Pagamento;
import com.fabriciocosta.pagamento.model.Pessoa;

@Service
public class PagamentoService {
	
	@Value("${projeto-pessoa.host}")
	private String pessoaHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Pagamento getPagamento(long idPessoa, Integer dias) {
		Map<String, String> uri = new HashMap<>();
		uri.put("id", ""+idPessoa);
		
		Pessoa pessoa = restTemplate.getForObject(pessoaHost + "/pessoa/{id}", Pessoa.class, uri);
		return new Pagamento(pessoa.getNome(), pessoa.getSalarioDiario(), dias);
	}
}
