package com.menino.pokedexapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.menino.pokedexapi.domain.dto.PutPokemonDto;

@Entity
public class Pokemon {

	/*
	@NotBlank
	private String imagem;
	 */
	
	@Id
	private Integer number;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String description;
	
	@NotBlank
	private String type1;

	private String type2;

	//Construtores
	public Pokemon(Integer number, @NotBlank String name, @NotBlank String description, @NotBlank String type1, String type2) {
		setNumber(number);
		setName(name);
		setDescription(description);
		setType1(type1);
		setType2(type2);
	}
	
	public Pokemon(Integer number, PutPokemonDto putPokemonDto) {
		setNumber(number);
		setName(putPokemonDto.getName());
		setDescription(putPokemonDto.getDescription());
		setType1(putPokemonDto.getType1());
		setType2(putPokemonDto.getType2());
	}
	
	public Pokemon() {}
	
	//Getters e setters

	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getNumber() {
		return number;
	}
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