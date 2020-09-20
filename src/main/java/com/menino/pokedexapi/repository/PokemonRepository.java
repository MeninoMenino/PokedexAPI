package com.menino.pokedexapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menino.pokedexapi.Entity.PokemonEntity;

public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer>{

}
