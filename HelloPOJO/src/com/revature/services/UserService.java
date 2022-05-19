package com.revature.services;

import com.revature.models.User;

// Interfaces are contracts with a subclass to use its methods/behaviors
public interface UserService {
	
	public User addUser(User u);
	public User editUser(User u);
	public User getUserById(int id);
	public void deleteUser(User u);

}
