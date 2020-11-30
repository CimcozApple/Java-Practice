package practice.array.largest;

import java.util.Arrays;

public class ForLoopLargest {

	//find the largest element in an array
	
		public static void main(String[] args) {
			
			int[] array = new int[] {2, 6, 21, 2, 5, 64, -78, -100};
			System.out.println("original array: " + Arrays.toString(array));
			
			int largest = printLargest(array);
			
			System.out.println("largest value: " + largest);
		}
		
		public static int printLargest(int[] arr) {
			int max = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
}
