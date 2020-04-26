// Written by Alexander Baker on 4/25/2020
/*
 * Program declares and calls methods that edit an ArrayList.
 */

import java.util.ArrayList; // for using ArrayList

public class Assignment3ArrayList {
	
	// method takes an ArrayList and removes all even length strings
	public static void removeEvenLength(ArrayList<String> other) {
		// go over each element and remove strings with even length
		for (int i = 0; i < other.size(); i++) {
			int wordLength = 0;
			
			for (String s : other) { 	// for-each loop
				wordLength = s.length();
				if (wordLength % 2 == 0) {
					other.remove(i);
				}
			}
		}
		System.out.println(other);
	}
	
	// method takes an ArrayList and replaces every string with two of the same string
	public static void doubleList(ArrayList<String> other) {
		// go over each element and replace the string with the doubled versions
		for (int i = 0; i < other.size(); i++) {
			String s = other.get(i);
			other.set(i, s + " " + s);
		}
		System.out.println(other);
	}

	public static void main(String[] args) {
		
		// create 2 new ArrayList
		ArrayList<String> food = new ArrayList<>();
		food.add("pizza");
		food.add("coke");
		food.add("french fries");
		
		ArrayList<String> greeting = new ArrayList<>();
		greeting.add("how");
		greeting.add("are");
		greeting.add("you?");
		
		
		// call methods
		removeEvenLength(food); //if method works this should print out only odd length String elements
		
		doubleList(greeting); //if method works this should print out the doubled string elements
		

	}

}
