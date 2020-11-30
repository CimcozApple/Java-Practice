package practice.arrays.search;

import java.util.Arrays;

public class FindString {

	//check if a string exists in an array
	
	public static void main(String[] args) {
		
	
		String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		String findString = "five";
		
		boolean isFound = false;
		
		isFound = Arrays.stream(stringArray).anyMatch(value -> value.equals(findString));	//how to find a string
	
		if(isFound) {
			System.out.println("String '" + findString + "' is in the array");
		} else {
			System.out.println("String '" + findString + "' cannot be found");
		}
	}		
}
