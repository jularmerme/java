package com.revature.drivers;

import java.util.Scanner;

import com.revature.models.User;
import com.revature.services.UserService;
import com.revature.services.UserServiceImpl;

public class UserDriver {
	
	
	// This instance will be used to make service calls to our lower layers of our app
	// aka handling our business logic of our app
	UserService userService = new UserServiceImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wwelcome user!. \nPlease register for our app.");
		
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Username: ");
		String username = sc.next();
		
		System.out.println("First Name: ");
		String firstName = sc.next();
		
		System.out.println("Last Name: ");
		String lastName = sc.next();
		
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		System.out.println("Password: ");
		String password = sc.next();
		
		System.out.print(String.format("Is this information correct? \nID: %d\nUsername: %s\nFirst Name: %s\nLast Name: %s\nEmail: %s\nPassword: %s", id, username, firstName, lastName, email, password));
		
		char answer = sc.next().charAt(0);
		
		if(answer=='y') {
			userService.addUser(new User(id, username, password, firstName, lastName, email));
		}
	}

}
