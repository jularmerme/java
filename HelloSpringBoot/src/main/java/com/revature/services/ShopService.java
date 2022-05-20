package com.revature.services;

import java.util.List;
import com.revature.models.Shop;

public interface ShopService {
	
	    // Create a new candy
		boolean createShop(Shop shop);
		
		// Get a candy by id
		Shop getShopById(int id);
		
		// Get all Candies
		List<Shop> getAllShops();
		
		// Update a Candy
		boolean updateShop(Shop shop);
		
		// Delete a candy
		boolean deleteShop(Shop shop);
}
