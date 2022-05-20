package com.revature.drivers;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.services.UserService;
import com.revature.services.UserServiceImpl;

public class UserDriver {
	
	
	// This instance will be used to make service calls to our lower layers of our app
	// aka handling our business logic of our app
	public static UserService userService = new UserServiceImpl();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome user!. \nPlease register for our app.");
		
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Username: ");
		String username = sc.next();
		
		System.out.print("First Name: ");
		String firstName = sc.next();
		
		System.out.print("Last Name: ");
		String lastName = sc.next();
		
		System.out.print("Enter Email: ");
		String email = sc.next();
		
		System.out.print("Password: ");
		String password = sc.next();
		
		System.out.print(String.format("Is this information correct? \nID: %d\nUsername: %s\nFirst Name: %s\nLast Name: %s\nEmail: %s\nPassword: %s", id, username, firstName, lastName, email, password));
		
		char answer = sc.next().charAt(0);
		
		if(answer == 'y') {
			userService.addUser(new User(id, username, password, firstName, lastName, email));
		}
	}

}
