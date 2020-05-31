// Written by Alexander Baker on 5/30/2020
/*
 * program calls method "stutter" that accepts a stack of integers
 * as a parameter and replaces every value in the stack with two
 * occurrences of that value. Uses a queue as auxiliary storage.
 */

import java.util.*;

public class Assignment7Stutter {
	
	// Method that accepts stack of integers and replaces every
	// value with two occurrences of that value.
	public static void stutter(Stack<Integer> s) {
		// queue for auxiliary storage
		Queue<Integer> q = new LinkedList<>();
		
		// fill stack with new values
		while (!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
			q.add(n);
		}
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		while (!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
	}

	public static void main(String[] args) {
		// create new Stack<Integer> collection and fill with initial values
		Stack<Integer> s = new Stack<>();
		Integer[] numbers = {3, 7, 1, 14, 9};
		for (Integer n : numbers) {
			s.push(n);
		}
		
		// Print out initial values in the stack
		System.out.println("Initial stack values: " + s);
		System.out.println("Initial stack size: " + s.size());
		
		// Call stutter method and print out new values in the stack
		stutter(s);
		System.out.println("New stack values: " + s);
		System.out.println("New stack size: " + s.size());

	}

}
