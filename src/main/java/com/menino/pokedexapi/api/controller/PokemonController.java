package com.menino.pokedexapi.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.menino.pokedexapi.api.controller.response.PokemonResponse;
import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menino.pokedexapi.Entity.PokemonEntity;
import com.menino.pokedexapi.repository.PokemonRepository;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	private PokemonRepository pokemonRepository;
	private PokemonService pokemonService;

	public PokemonController(PokemonRepository pokemonRepository, PokemonService pokemonService) {
		this.pokemonRepository = pokemonRepository;
		this.pokemonService = pokemonService;
	}

	//Lista todos os Pokémon
	@GetMapping
	public List<PokemonResponse> listarPokemon(){
		List<Pokemon> pokemons = pokemonService.listarTodos();

		return pokemons.stream()
				.map(PokemonResponse::new)
				.collect(Collectors.toList());
	}
	
	//Busca Pokémon por número
	@GetMapping("/{numero}")
	public ResponseEntity<PokemonEntity> buscarPokemon(@PathVariable int numero) {
		Optional<PokemonEntity> pokemon = pokemonRepository.findById(numero);
		return pokemon.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	//Insere um novo Pokémon
	@PostMapping
	public ResponseEntity<PokemonEntity> inserirPokemon(@RequestBody @Valid PokemonEntity pokemonEntity){
		PokemonEntity pokemonEntityInserido = pokemonRepository.save(pokemonEntity);
		return ResponseEntity.ok(pokemonEntityInserido);
	}
	
	//Altera os dados de um Pokémon salvo
	@PutMapping("/{numero}")
	public ResponseEntity<PokemonEntity> alterarPokemon(@PathVariable int numero,
														@RequestBody @Valid PokemonEntity pokemonEntity){
		Optional<PokemonEntity> pokemonExistente = pokemonRepository.findById(numero);
		if(!pokemonExistente.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pokemonEntity);
		}
	}
	
	//Deleta o registro de um Pokémon
	@DeleteMapping("/{numero}")
	public ResponseEntity<PokemonEntity> deletarPokemon(@PathVariable int numero) {
		if(!pokemonRepository.findById(numero).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			pokemonRepository.deleteById(numero);
			return ResponseEntity.noContent().build();
		}
	}
}
