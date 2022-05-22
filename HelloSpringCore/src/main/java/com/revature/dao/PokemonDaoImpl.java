package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Pokemon;

public class PokemonDaoImpl implements PokemonDao {

	@Override
	public List<Pokemon> getAllPokemon() {
		// Create a fake db connection to return to end user
		
		List<Pokemon> dbPokemon = new ArrayList<>();
		
		dbPokemon.add(new Pokemon(1, "Pikachu", "electric", 1500));
		dbPokemon.add(new Pokemon(1, "Seel", "wind", 500));
		dbPokemon.add(new Pokemon(1, "Video", "eyes", 200));
		dbPokemon.add(new Pokemon(1, "Music", "ears", 250));
		dbPokemon.add(new Pokemon(1, "Pikachu", "thunder", 1200));
		
		return dbPokemon;
	}

}
