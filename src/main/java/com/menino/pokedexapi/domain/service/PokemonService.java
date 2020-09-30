package com.menino.pokedexapi.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.menino.pokedexapi.domain.dto.AlterarPokemonDto;
import com.menino.pokedexapi.domain.model.ListaPokemon;
import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.domain.repository.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository pokemonRepository;

	//Serviços de CRUD

	public List<Pokemon> listar(){
		return pokemonRepository.findAll();
	}

	public ResponseEntity<Pokemon> buscar(Integer numero){
		Optional<Pokemon> pokemon = pokemonRepository.findById(numero);
		if(!pokemon.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pokemon.get());
		}
	}

	public ResponseEntity<Pokemon> inserir(Pokemon pokemon){
		Pokemon pokemonInserido = pokemonRepository.save(pokemon);
		return ResponseEntity.ok(pokemonInserido);
	}

	public ResponseEntity<Pokemon> alterar(Integer numero, AlterarPokemonDto alterarPokemonDto){
		Optional<Pokemon> pokemonExistente = pokemonRepository.findById(numero);
		if(!pokemonExistente.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			Pokemon pokemonAlterado = new Pokemon(pokemonExistente.get().getNumero(), alterarPokemonDto);
			return ResponseEntity.ok(pokemonRepository.save(pokemonAlterado));
		}
	}
	
	public ResponseEntity<Pokemon> deletar(Integer numero){
		if(!pokemonRepository.findById(numero).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			pokemonRepository.deleteById(numero);
			return ResponseEntity.noContent().build();
		}
	}

	//------------------------

	//Atualiza todos os Pokémon do banco de dados
	//@Bean
	public void atualizarBanco(){
		List<Pokemon> pkmn = pokemonRepository.findAll();
		pokemonRepository.deleteAll(pkmn);

		int tamanhoLote = 10;

		List<Pokemon> lista = new ListaPokemon().criarLista();
		List<Pokemon> lote = new ArrayList<Pokemon>();

		lista.stream()
		.forEach((pokemon) -> {
			lote.add(pokemon);

			if(lote.size() % tamanhoLote == 0 && lote.size() > 0) {
				pokemonRepository.saveAll(lote);
				lote.clear();
				pokemonRepository.flush();
			}
		});
		if(lote.size() > 0) {
			pokemonRepository.saveAll(lote);
			lote.clear();
			pokemonRepository.flush();
		}
	}
}