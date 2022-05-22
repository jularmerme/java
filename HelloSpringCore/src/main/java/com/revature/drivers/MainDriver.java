package com.revature.drivers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Pokemon;
import com.revature.services.PokemonService;
import com.revature.services.PokemonServiceImpl;

public class MainDriver {

	// 1. Set Up my applicationContext so I can define the IOC Container
	static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	public static void main(String[] args) {
		// 2. Need an instance of my Service
		PokemonService pokeService = appContext.getBean(PokemonServiceImpl.class);
		
		// 3. Print out the contents that I get back from my fake db
		List<Pokemon> list = pokeService.getAll();
		
		System.out.println("Amazing Pokemon Roster : ");
		
		for(Pokemon pokemon : list) {
			System.out.println(pokemon);
		}
	}

}
