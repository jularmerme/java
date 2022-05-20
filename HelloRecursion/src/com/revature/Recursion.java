package com.revature;

public class Recursion {

	public static void main(String[] args) {
		
		// 3! = 3 * 2 * 1 = 6
		System.out.println(factorial(-3));
		
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		System.out.println(factorial(5));
		
	}
	
	public static long factorial(int n) {
		if( n <= 0 ) { 
			return 1;
		} else { 
			return n * factorial(n - 1);
		}
	}

}
