package com.menino.pokedexapi.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class PokemonEntity {

	@Id
	@NotNull
	private int numero;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotBlank
	private String tipo1;
	
	private String tipo2;

}