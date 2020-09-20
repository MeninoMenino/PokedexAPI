package com.menino.pokedexapi.api.controller;


import com.menino.pokedexapi.api.controller.response.PokemonResponse;
import com.menino.pokedexapi.domain.model.Pokemon;
import com.menino.pokedexapi.repository.PokemonRepository;
import com.menino.pokedexapi.service.PokemonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PokemonControllerTest {

    private PokemonController pokemonController;

    @Mock
    private PokemonService pokemonService;

    @Mock
    private PokemonRepository pokemonRepository;

    @BeforeEach
    void setUp() {
        pokemonController = new PokemonController(pokemonRepository, pokemonService);
    }

    @Test
    void shouldCallPokemonServiceWhenFindingAllPokemons() {
        pokemonController.listarPokemon();

        verify(pokemonService).listarTodos();
    }

    @Test
    void shouldReturnAnResponseEntityWithAllPokemonsWhenListingAllPokemons() {

        Pokemon pokemon = new Pokemon(1, "gabriel", "pokemon de fogo super perigoso", "fogo", "perigoso");

        when(pokemonService.listarTodos()).thenReturn(singletonList(pokemon));
        List<PokemonResponse> expectedPokemons = singletonList(new PokemonResponse(pokemon));

        List<PokemonResponse> pokemonResponses = pokemonController.listarPokemon();


        assertThat(pokemonResponses).isEqualTo(expectedPokemons);


    }
}