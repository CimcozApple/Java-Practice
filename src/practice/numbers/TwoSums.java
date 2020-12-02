package practice.numbers;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
	
	public static void main(String[] args) {
		/* Given an array of integers, return the indices of the two numbers such that they add up to a specific target.
		 You may assume that each input would have exactly one solution, and you may not use the same element twice.
		 */
		int[] numbers = new int[] {9, 5, 8, 15, 4};
		int target = 14;
		int[] result = printSumIndices(numbers, target);
		System.out.println(result[0] + " " + result[1]);
		
	}
	
	public static int[] printSumIndices(int[] numbers, int target) {
	
		Map<Integer, Integer> integers = new HashMap<>();
		
		for(int i = 0; i < numbers.length; i++) {
			int diff = target - numbers[i];
			if(integers.containsKey(diff)) {
				return new int[] {i, integers.get(diff)};
			}
			integers.put(numbers[i], i);
		}
		return new int[] {-1, -1};
		
	}

}
