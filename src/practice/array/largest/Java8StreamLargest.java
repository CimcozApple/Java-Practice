package practice.array.largest;

import java.util.Arrays;

public class Java8StreamLargest {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 29, -2, 8, 9643, 30, -702};
		
		int largest = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("largest number is: " + largest);
	}	
}
