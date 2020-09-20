package com.menino.pokedexapi.api.controller.response;

import com.menino.pokedexapi.domain.model.Pokemon;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class PokemonResponse {

    private final int numero;
    private final String nome;
    private final String descricao;
    private final String tipo1;
    private final String tipo2;

    public PokemonResponse(int numero, String nome, String descricao, String tipo1, String tipo2) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    public PokemonResponse(Pokemon pokemon) {
        this.numero = pokemon.getNumero();
        this.nome = pokemon.getNome();
        this.descricao = pokemon.getDescricao();
        this.tipo1 = pokemon.getTipo1();
        this.tipo2 = pokemon.getTipo2();
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }
}
