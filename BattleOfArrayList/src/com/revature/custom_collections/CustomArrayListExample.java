package com.revature.custom_collections;

public class CustomArrayListExample {

	public static void main(String[] args) {
		
		MyArrayList<String> brands = new MyArrayList<>();
		
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
