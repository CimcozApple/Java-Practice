package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddTwoArrays {

	//combine two arrays together
	public static void main(String[] args) {
		
		Integer[] arr1 = {1,2,3,4,5};
		
		Integer[] arr2 = {6,7,8,9,10};
		
		List<Integer> intList = new ArrayList<>();
		
		Collections.addAll(intList, arr1);		//first array
		
		Collections.addAll(intList, arr2);		//second array
		
		//convert from list to array
		
		System.out.println("list: " + intList);
		
		Integer[] combined = {};
		
		combined = intList.toArray(combined);
		
		System.out.println("array: " + Arrays.toString(combined));
	}
}
