package com.revature.services;

import java.util.List;

import com.revature.models.Candy;

public interface CandyService {
	
	// Create a new candy
	boolean createCandy(Candy candy);
	
	// Get a candy by id
	Candy getCandyById(int id);
	
	// Get all Candies
	List<Candy> getAllCandies();
	
	// Update a Candy
	boolean updateCandy(Candy candy);
	
	// Delete a candy
	boolean deleteCandy(Candy candy);
	
}
