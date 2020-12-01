package practice.arrays;

import java.util.Arrays;

public class ReverseArray {

	//reverse an array
	public static void main(String[] args) {
		
		int[] original = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("original array: " + Arrays.toString(original));
		
		int temp;
		
		int[] reverse = original;
		
		for(int i = 0; i < original.length/2; i++) {
			temp = original[i];
			original[i] = original[original.length - 1 - i];
			original[original.length - 1 - i] = temp;
		}
		System.out.println("reversed array: " + Arrays.toString(reverse));
	}
}
