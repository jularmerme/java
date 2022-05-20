package com.revature.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.revature.exceptions.*;

import com.revature.models.User;

public class UserServiceImpl implements UserService {
	
	public File createDBConnection() throws CustomFileException {
		// 1. Create a test file
		File myFile = new File("users.txt");
		try {
			if(myFile.createNewFile() == true) {
				// 2. Print successfully connection to console
				System.out.println("File has been successfully created: " + myFile.getName());
			} else {
				System.out.println("File already exist.");
			}
		} catch (CustomFileException e) {
			throw new CustomFileException("Something went wrong in with the file");
		} catch (IOException e ) {
			e.printStackTrace();
		}
		return myFile;
	}

	@Override
	public User addUser(User u) {
		// User tom = new User(1, "tom", "password","Tom","Thumub","tom.thumb@gmail.com");
		try {
			
			// 1. Serialize our user(convert user to array)
			FileOutputStream output = new FileOutputStream(createDBConnection());
			
			// 2. Write that binary data into our text file
			output.write(u.toString().getBytes());
			
			// 3. Print successful addition message
			System.out.println("New user has been created");
			
			// Close the file
			output.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CustomFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public User editUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		
	}

}
