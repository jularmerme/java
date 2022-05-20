package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.ClientMessage;
import com.revature.model.Hero;
import com.revature.service.HeroService;
//import com.revature.util.ClientMessageUtil.REGISTRATION_SUCCESSFUL;
//import com.revature.util.ClientMessageUtil.SOMETHIG_IS_WRONG;


// This will tell Spring MVC that this class can handle HTTP requests
@Controller
// @RequestMapping specifies a URL at with the method is available - binding a function/class to a URL pattern(GET or POST)
@RequestMapping("/api")
public class HeroControllerImpl implements HeroController {

	// Since this controller relies on the service layer, we need to inject this dependency
	@Autowired
	HeroService heroService;
	
	/*
	 * GET mapping specifies that if the client send a get request to this URL, this method will trigger the response
	 * 
	 * URL: http://localhost:8080/HelloSpringMVC/api/findAllHeroes
	 * 
	 * @ResponseBody => Specifies what we return to the client (typically in JSON format) -> Java (JSON marshaling objects)
	 * 
	 */
	
	@Override
	@GetMapping("/findAllHeroes")
	public @ResponseBody List<Hero> findAllHeroes() {
		// He would have to call the service layer 
		return heroService.getAllHeroes();
	}

	@Override
	@PostMapping("/regiter") // Automatically allows us to create new resources though our controller
	// @RequestBody => Specifies the type of information the method is taking in -> unmarshaling (taking in JSON file convert into a java object)
	public ClientMessage registerHero(@RequestBody Hero hero) {
		/*
		 * Based in another insert operation is successful, we will return a specific 
		 * ClientMessage, so when I call the service method.
		 * 
		 * But if it is succesful, we send a SUCCESS message, if not successful, we send back a message 'something went wrong'
		 * 
		 */
		return heroService.registerHero(hero) ? REGISTRATION_SUCCESSFUL : SOMETHING_IS_WRONG;
	}

	@Override
	@GetMapping("/findHero")
	// @RequestParam will extract name from params of the URL for us
	// http://localhost:8080/HelloSpringMVC/api/findHero/?name=bob
	public @ResponseBody Hero findHero(@RequestParam String name) {
		return heroService.getHero(name); // Thanks to JSON Databind, this will return a JSON object
	}
	

}
