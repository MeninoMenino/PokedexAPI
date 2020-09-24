package com.menino.pokedexapi.domain.dto;

import javax.validation.constraints.NotBlank;

public class AlterarPokemonDto {

	@NotBlank
	private String nome;
	
	@NotBlank
	private String descricao;
	
	@NotBlank
	private String tipo1;

	private String tipo2;

	public AlterarPokemonDto(String nome, String descricao, String tipo1, String tipo2) {
		setNome(nome);
		setDescricao(descricao);
		setTipo1(tipo1);
		setTipo2(tipo2);
	}
	
	//Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
}
