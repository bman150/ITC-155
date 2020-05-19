import java.util.Arrays;

// Written by Alexander Baker on 5/18/2020

// ch 13 p. 890 exercise 18
// a modified selection sort algorithm that sorts values of elements from largest to smallest


public class ModifiedSelectionSort {
	
	// places the elements of the given array into sorted order
	// using the selection sort algorithm that has been modified
	// post: array is in sorted (decreasing) order
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// find index of largest element
			int largest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[largest]) {
					largest = j;
				}
			}
			swap(a, i, largest);
		}
	}
	
	// method for swapping around the elements of an array
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	// main method for testing modified algorithm
	public static void main (String [] args) {
		// create a new int[] array
		int[] numbers = {12, 123, 1, 28, 183, 16, 200, 199};
		
		// call method and pass the array into it
		selectionSort(numbers);
		
		// print to the console the sorted array
		System.out.println(Arrays.toString(numbers));
	}

}
