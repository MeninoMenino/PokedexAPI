package com.menino.pokedexapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Pokemon {

	/*
	@NotBlank
	private String imagem;
	 */
	
	@Id
	private Integer numero;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String descricao;
	
	@NotBlank
	private String tipo1;

	private String tipo2;

	//Construtores
	public Pokemon(Integer numero, @NotBlank String nome, @NotBlank String descricao, @NotBlank String tipo1, String tipo2) {
		setNumero(numero);
		setNome(nome);
		setDescricao(descricao);
		setTipo1(tipo1);
		setTipo2(tipo2);
	}
	
	public Pokemon() {}
	
	//Getters e setters

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
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