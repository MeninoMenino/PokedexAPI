package com.menino.pokedexapi.domain.dto;

import javax.validation.constraints.NotBlank;

public class PutPokemonDto {

	@NotBlank
	private String name;
	
	@NotBlank
	private String description;
	
	@NotBlank
	private String type1;

	private String type2;

	public PutPokemonDto(String name, String description, String type1, String type2) {
		setName(name);
		setDescription(description);
		setType1(type1);
		setType2(type2);
	}
	
	//Getters e Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}
}
