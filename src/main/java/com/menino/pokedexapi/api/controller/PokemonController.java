package com.menino.pokedexapi.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.domain.repository.PokemonRepository;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	PokemonRepository pokemonRepository;

	//Lista todos os Pokémon
	@GetMapping
	public List<Pokemon> listarPokemon(){
		return pokemonRepository.findAll();
	}

	//Busca Pokémon por número
	@GetMapping("/{numero}")
	public ResponseEntity<Pokemon> buscarPokemon(@PathVariable int numero) {
		Optional<Pokemon> pokemon = pokemonRepository.findById(numero);
		if(!pokemon.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pokemon.get());
		}
	}

	//Insere um novo Pokémon
	@PostMapping
	public ResponseEntity<Pokemon> inserirPokemon(@Valid @RequestBody Pokemon pokemon){
		Pokemon pokemonInserido = pokemonRepository.save(pokemon);
		return ResponseEntity.ok(pokemonInserido);
	}

	//Altera os dados de um Pokémon salvo
	@PutMapping("/{numero}")
	public ResponseEntity<Pokemon> alterarPokemon(@PathVariable int numero,
			@RequestBody @Valid Pokemon pokemon){
		Optional<Pokemon> pokemonExistente = pokemonRepository.findById(numero);
		if(!pokemonExistente.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pokemon);
		}
	}

	//Deleta o registro de um Pokémon
	@DeleteMapping("/{numero}")
	public ResponseEntity<Pokemon> deletarPokemon(@PathVariable int numero) {
		if(!pokemonRepository.findById(numero).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			pokemonRepository.deleteById(numero);
			return ResponseEntity.noContent().build();
		}
	}
}
