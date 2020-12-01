package practice.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		
		Integer[] arr = {0, 5, 7, 4, 2, 6, 3, 9, 8, 1};
		
		System.out.println("unsorted array: ");
		
		sortArray(arr);
		
		//sorting in ascending order------------------------------------------------------------------
		System.out.println("\n\nsorted array in ascending order");
		
		Arrays.sort(arr);
		
		sortArray(arr);
		
		//sorting in descending order-----------------------------------------------------------------
		System.out.println("\n\nsorted array in descending order");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		sortArray(arr);
	}
	
	public static void sortArray(Integer[] arr) {
		for(Integer number : arr) {
			System.out.print(number + " ");
		}
	}
}
