// Written by Alexander Baker on 5/20/2020

/*
 * program sorts an input of positive numbers and sorts
 * them into descending order.
 */

import java.util.Scanner;
import java.util.*;

public class DescendingOrder {
	//TODO: Write a void method selectionSortDescendTrace() that takes
	//an integer array and the number of elements in the array as arguments,
	//and sort the array into descending order.
	public static void selectionSortDescendTrace(int[] numbers, int numElements) {
		// nested for-each loop or nested while loop or nested for loop?
		for (int i = 0; i < numElements - 1; i++) {
			//System.out.println(Arrays.toString(Arrays.copyOf(numbers, numElements)));
			for (int j = i + 1; j < numElements; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			for (int k = 0; k < numElements; k++) {
				System.out.print(numbers[k] + " ");
			}
			//System.out.println(Arrays.toString(Arrays.copyOf(numbers, numElements)));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int input, i = 0;
		int numElements = 0;
		int[] numbers = new int[10];
		
		//TODO: Read in a list of up to 10 positive integers; stop when
		//-1 is read. Then call selectionSortDescendTrace() method.
		
		// Read in a list of up to 10 positive integers; stop when -1 is read.
		System.out.println("Enter up to 10 positive integers, seperated by space. -1 to exit");
		do {
			input = scnr.nextInt();
			numbers[i] = input;
			i++;
			numElements++;
		} while(i <= 9 && input != -1);
		
		for (int j = 0; j <= i; j++) {
			if (numbers[j] == -1) {
				numbers[j] = 0;
				numElements--;
			}
		}
		//System.out.println(Arrays.toString(numbers));
		//System.out.println(numElements);
		
		// Call selectionSortDescendTrace() method
		selectionSortDescendTrace(numbers, numElements);
	}

}
