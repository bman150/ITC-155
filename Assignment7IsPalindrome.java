// Written by Alexander Baker on 5/30/2020
/*
 * program calls method "isPalindrome" that accepts a queue of integers
 * as a parameter and returns true if the numbers in the queue are
 * the same in reverse order. Uses a stack as auxiliary storage.
 */

import java.util.*;

public class Assignment7IsPalindrome {
	
	// Method that accepts a queue of integers and returns a boolean value
	public static boolean isPalindrome(Queue<Integer> q) {
		// stack for auxiliary storage
		Stack<Integer> s = new Stack<>();
		
		// determine if the queue integers are a palindrome or not
		boolean palindrome = true;
		Queue<Integer> initial = new LinkedList<>(q);
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		while (!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
		}
		if (!q.equals(initial)) {
			palindrome = false;
		}
		
		return palindrome;
	}

	public static void main(String[] args) {
		// create new queue<Integer> collections for testing "isPalindrome"
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		Integer[] num1 = {3, 8, 17, 9, 17, 8, 3};
		Integer[] num2 = {3, 17, 9, 4, 17, 3};
		for (Integer n1 : num1) {
			q1.add(n1);
		}
		for (Integer n2 : num2) {
			q2.add(n2);
		}
		
		// call isPalindrome method
		System.out.println(q1);
		System.out.print("palindrome = " + isPalindrome(q1));
		System.out.println();
		System.out.println(q2);
		System.out.print("palindrome = " + isPalindrome(q2));

	}

}
