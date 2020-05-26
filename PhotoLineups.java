// Written by Alexander Baker on 5/20/2020
/*
 * program lists all ways people can line up for a photo
 * (all permutations of a list of Strings).
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
	
	//TODO: Write method to create and output all permutations of the list of names.
	// Recursive method creates and outputs all permutations of a list of names.
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		
		int i;
		int size = nameList.size();
		
		//base case
		
		if (size == 0) {
			
			for (i = 0; i < permList.size(); ++i) {
				System.out.print(permList.get(i) + " ");
			}
			System.out.println();
		} else {
			//recursive case
			for (i = 0; i < size; ++i) {
				
				//create the arraylist for the permutations
				ArrayList<String> newPerms = new ArrayList<String>(permList);
				
				//add the items from the namelist to the perms list
				newPerms.add(nameList.get(i));
				
				//create a new names arraylist
				ArrayList<String> newNames = new ArrayList<String>(nameList);
				
				//remove the name at current index
				newNames.remove(i);
				
				//do the same with the new namelist recursively until base case is reached
				allPermutations(newPerms, newNames);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String name;
		
		//TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
		// Step 1: Read in a list of one word names into an ArrayList
		System.out.println("Enter one word names, separated by a space. -1 to exit");
		name = scnr.next();
		
		while (!name.equals("-1")) {
			nameList.add(name);
			name = scnr.next();
		}
		
		// Step 2: Call recursive method
		allPermutations(permList, nameList);
	}

}
