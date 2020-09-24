package com.menino.pokedexapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.menino.pokedexapi.domain.dto.AlterarUsuarioDto;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@NotBlank
	String nome;
	@NotBlank
	String email;
	@NotBlank
	String senha;
	
	
	//Construtores
	
	public Usuario(Long id, AlterarUsuarioDto alterarUsuarioDto) {
		setId(id);
		setNome(alterarUsuarioDto.getNome());
		setEmail(alterarUsuarioDto.getEmail());
		setSenha(alterarUsuarioDto.getSenha());
	}
	
	//Getters e Setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
