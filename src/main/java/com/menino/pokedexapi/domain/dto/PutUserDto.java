package com.menino.pokedexapi.domain.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class PutUserDto {
	@NotBlank
	String name;
	@NotBlank
	@Email
	String email;
	@NotBlank
	String password;
	
	
	//Getters e Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
