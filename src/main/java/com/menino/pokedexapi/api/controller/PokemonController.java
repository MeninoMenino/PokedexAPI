package com.menino.pokedexapi.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menino.pokedexapi.domain.dto.AlterarPokemonDto;
import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.domain.repository.PokemonRepository;
import com.menino.pokedexapi.domain.service.PokemonService;

@RestController
@CrossOrigin
@RequestMapping("/pokemon")
public class PokemonController {

	//Repositório
	@Autowired
	PokemonRepository pokemonRepository;

	//Classe de Serviços
	@Autowired
	PokemonService pokemonService;
	
	//Lista todos os Pokémon
	@GetMapping
	public List<Pokemon> listarPokemon(){
		return pokemonService.listar();
	}

	//Busca Pokémon por número
	@GetMapping("/{numero}")
	public ResponseEntity<Pokemon> buscarPokemon(@PathVariable int numero) {
		return pokemonService.buscar(numero);
	}

	//Insere um novo Pokémon
	@PostMapping
	public ResponseEntity<Pokemon> inserirPokemon(@Valid @RequestBody Pokemon pokemon){
		return pokemonService.inserir(pokemon);
	}

	//Altera os dados de um Pokémon salvo
	@PutMapping("/{numero}")
	public ResponseEntity<Pokemon> alterarPokemon(@PathVariable int numero,
			@RequestBody @Valid AlterarPokemonDto alterarPokemonDto){
		return pokemonService.alterar(numero, alterarPokemonDto);
	}

	//Deleta o registro de um Pokémon
	@DeleteMapping("/{numero}")
	public ResponseEntity<Pokemon> deletarPokemon(@PathVariable int numero) {
		return pokemonService.deletar(numero);
	}
}
