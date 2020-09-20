package com.menino.pokedexapi.domain.model;

import lombok.Getter;

@Getter
public class Pokemon {

    private int numero;
    private String nome;
    private String descricao;
    private String tipo1;
    private String tipo2;

    public Pokemon(int numero, String nome, String descricao, String tipo1, String tipo2) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }


}
