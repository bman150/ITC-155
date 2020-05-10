// Written by Alexander Baker on 5/10/2020
// ITC-155 Spring 2020 quarter
/*
 * Program declares and calls a method that takes an integer as its parameter
 * and prints to the console numbers separated by commas in sequential order
 * up to the integer passed to the method.
 */


public class RecursionAsignment {

	// declare method
	public static void writeNums(int n) {
		// throw an IllegalArgument exception if n < 1
		if (n < 1) {
			throw new IllegalArgumentException("number cannot be less than 1");
		} else if (n == 1) {
			System.out.print(n);
		} else {
			writeNums(n - 1);
			System.out.print(", " + n);
		}
	}
	
	public static void main(String[] args) {
		// call method
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
		
		// prints an error message to the console because n < 1
		writeNums(-1);

	}

}
