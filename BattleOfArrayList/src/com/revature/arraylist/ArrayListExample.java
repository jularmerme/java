package com.revature.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		// Add elements to the ArrayList
		// Add => Inserts a single item into the ArrayList
		food.add("apple");
		food.add("banana");
		food.add("kiwi");
		food.add("watermelon");
		food.add("soap");
		
		ArrayList<String> groceryList = new ArrayList<String>();
		
		// addAll => Requires a collection of the same type to insert elements
		// into its list
		groceryList.addAll(food);
		groceryList.add("water");
		
		for(String s : food) {
			System.out.println(s);
		}
		
//		for(String s : groceryList) {
//			System.out.println(s);
//		}
		
		food.remove(2);
		
		System.out.println("__________________________________________");
		
		for(String s : food) {
			System.out.println(s);
		}

	}

}
