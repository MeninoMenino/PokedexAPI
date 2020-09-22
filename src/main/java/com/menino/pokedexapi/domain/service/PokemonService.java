package com.menino.pokedexapi.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.menino.pokedexapi.domain.model.ListaPokemon;
import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.domain.repository.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository pokemonRepository;

	//Atualiza todos os Pokémon do banco de dados
	@Bean
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
