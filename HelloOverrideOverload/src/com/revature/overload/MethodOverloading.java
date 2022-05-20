package com.revature.overload;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		System.out.println("Calling all the methods....");
			
		System.out.println(add(4, 6, 9));
		System.out.println(add(4, 9));
		System.out.println(add(4.6, 6.9, 9.2));
		
	}
	
	
	/* 
	 * Method Overloading -> Method having the same name and different signature by 	    		 	 * datatype or number of paramenters must be different, method name same
	 * datatype or number of params must be different, method name same, return type doesn't
	 * matter - this is an example of polymorphism
	 * 
	 */
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int add(double a, double b) {
		// Casting to prevent type coercion from happing
		return (int)(a + b);
	}
	
	public static double add(double a, double b, double c) {
		return a + b + c;
	}
	
}
