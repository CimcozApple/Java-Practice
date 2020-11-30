package practice.arrays.duplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWithSet {

	public static void main(String[] args) {
		
		Integer[] originalArray = {5, 53, -29, 0, 90, -34, 2, 5, 67, 4, 6, 5};
		
		System.out.println("original array: " + Arrays.toString(originalArray));
		
		//passing the array to a linked hashset
		Set<Integer> intSet = new LinkedHashSet<>(Arrays.asList(originalArray));
		
		//new array
		Integer[] newArray = new Integer[intSet.size()];

		//converting back to array
		newArray = intSet.toArray(newArray);
		
		System.out.println(Arrays.toString(newArray));
	
	}
}
