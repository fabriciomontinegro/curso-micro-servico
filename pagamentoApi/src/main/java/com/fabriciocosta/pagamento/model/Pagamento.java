package com.fabriciocosta.pagamento.model;

import java.io.Serializable;

public class Pagamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private double pagamentoDiario;
	private Integer dias;
	
	public Pagamento() {}
	
	public Pagamento(String nome, double pagamentoDiario, Integer dias) {
		this.nome = nome;
		this.pagamentoDiario = pagamentoDiario;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPagamentoDiario() {
		return pagamentoDiario;
	}

	public void setPagamentoDiario(double pagamentoDiario) {
		this.pagamentoDiario = pagamentoDiario;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {
		return this.dias * this.pagamentoDiario;
	}
}
