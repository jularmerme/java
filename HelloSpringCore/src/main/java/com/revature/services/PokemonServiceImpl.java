package com.revature.services;
import java.util.List;

import com.revature.dao.PokemonDao;
import com.revature.models.Pokemon;

public class PokemonServiceImpl implements PokemonService {

	private PokemonDao pokemonDao;

	// Constructor injection
	public PokemonServiceImpl(PokemonDao pokeDao) {
		this.pokemonDao = pokeDao;
	}

	// ------------------------------------------------------------------

	// Two examples of setter injection

	// Default constructor for setter injection that the config file will be working
	// with
	// Will be doing it from the config file
	public PokemonServiceImpl() {
	}

	// Setter injection manually thru a setter
	public void setPokeDao(PokemonDao pokeDao) {
		this.pokemonDao = pokeDao;
	}

	// This is the same as this
	// Private static PokemonDao pokeDao = new PokemonDaoImpl();

	@Override
	public List<Pokemon> getAll() {
		return pokemonDao.getAllPokemon();
	}

}
