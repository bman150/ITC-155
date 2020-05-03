// Written by Alexander Baker on 5/2/2020
/*
 * Program declares and call a method that does the following:
 * 1. accepts a map as a parameter whose keys and values are strings
 * 2. returns true if no two keys map to the same value
 */

import java.util.*; // to use Set, Map and HashMap

public class Collections_Main {
	
	// declare method that accepts a map as a parameter and returns a boolean
	public static boolean isUnique(Map<String, String> other) {
		String duplicate = "";
		boolean noCopy = true;
		
		// create a Collection of the maps values
		Collection<String> valueCollection = other.values();
		for (String initial : valueCollection) {
			if (initial != duplicate) {
				duplicate = initial;
			}else {
				noCopy = false;
			}
		}
		
		return noCopy;
	}

	public static void main(String[] args) {
		
		// create new map collections to test the method
		Map<String, String> nextGen = new HashMap<>();
		nextGen.put("Picard", "Captain");
		nextGen.put("Worf", "Chief of Security");
		nextGen.put("O'Brian", "Tansporter Chief");
		
		Map<String, String> cleaning = new HashMap<>();
		cleaning.put("Teeth", "Toothbrush");
		cleaning.put("Toilete", "Toiletebrush");
		cleaning.put("Hair", "Shampo");
		cleaning.put("Dentures", "Toothbrush");
		cleaning.put("Hands", "Shampo");
		cleaning.put("Car", "Hose");
		
		// call methods
		System.out.println(nextGen);
		System.out.println("'" + "nextGen" + "'" + " map having unique values is " + isUnique(nextGen));
		
		System.out.println(cleaning);
		System.out.println("'" + "cleaning" + "'" + " map having unique values is " + isUnique(cleaning));

	}

}
