package com.menino.pokedexapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menino.pokedexapi.domain.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
	
}
