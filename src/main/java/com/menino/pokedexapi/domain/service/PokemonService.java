package com.menino.pokedexapi.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.menino.pokedexapi.domain.dto.PutPokemonDto;
import com.menino.pokedexapi.domain.model.PokemonList;
import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.domain.repository.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository pokemonRepository;

	//Serviços de CRUD

	public List<Pokemon> list(){
		return pokemonRepository.findAll();
	}

	public ResponseEntity<Pokemon> search(Integer number){
		Optional<Pokemon> pokemon = pokemonRepository.findById(number);
		if(!pokemon.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pokemon.get());
		}
	}

	public ResponseEntity<Pokemon> post(Pokemon pokemon){
		Pokemon postedPokemon = pokemonRepository.save(pokemon);
		return ResponseEntity.ok(postedPokemon);
	}

	public ResponseEntity<Pokemon> put(Integer number, PutPokemonDto putPokemonDto){
		Optional<Pokemon> existentPokemon = pokemonRepository.findById(number);
		if(!existentPokemon.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			Pokemon patchedPokemon = new Pokemon(existentPokemon.get().getNumber(), putPokemonDto);
			return ResponseEntity.ok(pokemonRepository.save(patchedPokemon));
		}
	}
	
	public ResponseEntity<Pokemon> delete(Integer number){
		if(!pokemonRepository.findById(number).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			pokemonRepository.deleteById(number);
			return ResponseEntity.noContent().build();
		}
	}

	//------------------------

	//Atualiza todos os Pokémon do banco de dados
	//@Bean
	public void fillDatabase(){
		List<Pokemon> pkmn = pokemonRepository.findAll();
		pokemonRepository.deleteAll(pkmn);

		int packSize = 10;

		List<Pokemon> list = new PokemonList().createList();
		List<Pokemon> pack = new ArrayList<Pokemon>();

		list.stream()
		.forEach((pokemon) -> {
			pack.add(pokemon);

			if(pack.size() % packSize == 0 && pack.size() > 0) {
				pokemonRepository.saveAll(pack);
				pack.clear();
				pokemonRepository.flush();
			}
		});
		if(pack.size() > 0) {
			pokemonRepository.saveAll(pack);
			pack.clear();
			pokemonRepository.flush();
		}
	}
}