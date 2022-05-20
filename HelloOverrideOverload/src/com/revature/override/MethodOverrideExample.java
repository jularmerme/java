package com.revature.override;

public class MethodOverrideExample {

	public static void main(String[] args) {

		Wolf wolf = new Wolf();
		
		Animal cat = new Animal();
		
		wolf.speak();
		cat.speak();
		
		// This speak() of animal class is being overriding by base class wolf
		Animal warewolf = new Wolf();
		warewolf.speak();
		
	}

}
