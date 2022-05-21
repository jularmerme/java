package com.revature.custom_collections;

/*
 * Generics are used to provide abstraction by making parameterized types
 * Through generics, we can create classes that work with different data types
 * 
 * Commonly generics follow the following type name convention
 * 
 * E - Element
 * T - Type
 * K - Key
 * V - Value
 * N - Number
 * S, U, V, etc - 2nd, 3rd and 4th types
 * ? Wildcare -> Any unexpected type
 * 
 * Benefits fo generics: 
 * - More dynamic/flexible code that can take in any sort of data
 * - More generic programming that can be reusable throughout our application
 * 
 * 
 * - Commonly wrapper classes are used with generics
 * - A wrapper class is a utility class that provides object like behavior to a
 *   primitive data type
 * - In other words, "wraps your primitive in a giftbox marked Object"
 * - List
 * 	 - int -> Integer
 *   - char -> Character
 *   - bool -> Boolean
 *   - etc
 * ex: ArrayList<String>
 * This is an example of autoboxing
 * 
 * Type Casting -> Is the process of assigning a variable of one type to a value of another
 * type.
 * 
 * Autoboxing -> When you take a primitive and assign it to a wrapper class object.
 * Unboxing -> Takin the wrapper class object and converting it into a primitive
 */
public interface MyCollection<T> {
	
	boolean add(T element);
	boolean contains(T element);
	boolean empty();
	boolean remove(T element);
	int size();
	
}
