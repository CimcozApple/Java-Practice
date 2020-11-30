package practice.arrays.search;

import java.util.stream.IntStream;

public class FindInt {
	
	//check if a number exists in an array
	public static void main(String[] args) {
		
		int[] array = {1,34,-5, 39, 22, 100, 104, 90, 6, -80, 22};
		
		int num = 22;
		
		boolean isFound = false;
		
		//1. using for loop
		System.out.println("-----------------------------------------using for loop");
		for(int i = 0; i<array.length; i++) {
			if(array[i] == num) {
					
				isFound = true;
			}
		}
		if(isFound) {
			
			System.out.println("number '" + num + "' is found in the array");
			
		} else {
			
			System.out.println("number '" + num + "' cannot be found");
		}
		
		//2. using stream
		System.out.println("\n-----------------------------------------using stream");
		
		isFound = IntStream.of(array).anyMatch(condition -> condition == num);
		
		if(isFound) {
			System.out.println("number '" + num + "' is found in the array");
			
		} else {
			
			System.out.println("number '" + num + "' cannot be found");
		}
	}

}
