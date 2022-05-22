package com.revature.custom_collections;

import java.util.ArrayList;

public class CustomArrayListExample {

	public static void main(String[] args) {
		
		MyArrayList<String> brands = new MyArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		
		brands.add("nike");
		brands.add("Pepsi");
		brands.add("Puma");
		brands.add("Toyota");
		brands.add("Nintendo");
		
		for(int i=0; i< brands.size; i++) {
			System.out.println(brands.get(i));
		}
		
	}

}
