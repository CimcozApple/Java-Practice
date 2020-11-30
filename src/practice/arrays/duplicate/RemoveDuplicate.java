package practice.arrays.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	/* three ways to remove duplicates from an array using stream and list */
	public static void main(String[] args) {
		
		
		Integer [] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 2, 2, 9, 2};
		
		/*
		 stream returns a sequential stream
		 returns a stream with distinct elements
		 */
		List<Integer> removeDuplicate = Arrays.asList(intArray).stream().distinct().collect(Collectors.toList());
		
		System.out.println("using first method: " + removeDuplicate);
	
	}
}
