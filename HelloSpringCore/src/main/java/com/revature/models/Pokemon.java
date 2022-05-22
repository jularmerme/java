package com.revature.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public @Data class Pokemon {

	private int pokeId;
	private String pokemonName;
	private String pokeType;
	private int attackPower;

	public Pokemon() {
		super();
	}

	public Pokemon(String pokemonName, String pokeType, int attackPower) {
		super();
		this.pokemonName = pokemonName;
		this.pokeType = pokeType;
		this.attackPower = attackPower;
	}

	public Pokemon(int pokeId, String pokemonName, String pokeType, int attackPower) {
		super();
		this.pokeId = pokeId;
		this.pokemonName = pokemonName;
		this.pokeType = pokeType;
		this.attackPower = attackPower;
	}

}
