package com.fabriciocosta.pagamento.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabriciocosta.pagamento.model.Pagamento;
import com.fabriciocosta.pagamento.service.PagamentoService;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource {
	
	@Autowired
	private PagamentoService pagamentoService;
	
	@GetMapping(value = "/{idPessoa}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable long idPessoa, @PathVariable Integer dias) {
		Pagamento pagamento = pagamentoService.getPagamento(idPessoa, dias);
		return ResponseEntity.ok(pagamento);
	}
}
