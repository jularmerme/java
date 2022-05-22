package com.revature.drivers;

import java.util.Scanner;

import com.revature.models.Wizard;
import com.revature.services.WizardService;
import com.revature.services.WizardServiceImpl;

public class WizardDriver {
	
	public static WizardService wizService = new WizardServiceImpl();
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int selection = optionMenu();
		
		switch(selection) {
			case 1:
				System.out.println("Welcome to Hogarts! Please enter info below. ");
				
				System.out.print("Name : ");
				String name = in.next();
				
				System.out.print("");
				
				System.out.print("Spell : ");
				String spell = in.next();
				wizService.createNewWizard(new Wizard(0, name, spell));
				break;
			default:
				System.out.println("You choose a unavailable option. Try again");
				break;
		}
		
	}
	
	public static int optionMenu() {
		System.out.println("Choose from the following options: ");
		System.out.println("1. Add.");
		System.out.println("-------------------");
		System.out.print("Your Selection[1] : ");
		
		int selection = in.nextInt();
		
		return selection;
		
	}

}
