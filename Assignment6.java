// Written by Alexander Baker on 5/18/2020
// Solutions for chapter 13 p. 888 exercise 4 and 5.


public class Assignment6 {
	// exercise 4 solution
	// This algorithm belongs to the complexity class: Linear aka O(N).
	// The reason for this is because the for-loops runtime is directly proportional
	// to N aka list.length
	public static int [] mystery1(int[] list) {
		int[] result = new int[2 * list.length];
		for (int i = 0; i < list.length; i++) {
			result[2 * i] = list[i] / 2 + list[i] % 2;
		}
		return result;
	}
	
	// exercise 5 solution
	// This algorithm belongs to the complexity class: Logarithmic aka O(log N)
	// The reason for this is because the for-loop is following a "divide and conquer" approach
	// by dividing the problem space in half repeatedly.
	public static void mystery2(int[] list) {
		for (int i = 0; i < list.length / 2; i++) {
			int j = list.length - 1 - i;
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}

}
