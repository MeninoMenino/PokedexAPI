package com.menino.pokedexapi.domain.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AlterarUsuarioDto {
	@NotBlank
	String nome;
	@NotBlank
	@Email
	String email;
	@NotBlank
	String senha;
	
	
	//Getters e Setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
