package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayToArrayList {

	//convert from array to arrayList
	public static void main(String[] args) {
		
		Integer[] intArray = {25, 432, 68, 200, -90, -26};
		
		System.out.println("array before conversion: " + Arrays.toString(intArray));
		
		//1. using Arrays.asList() method (more efficient but less flexible)------------------------------------------
		//convert to a list
		List<Integer> intList = Arrays.asList(intArray);
		
		//intList.add(4);		cannot add
		intList.set(1, 90);	// can change
		//intList.remove(4);	cannot remove
		
		System.out.println("array to list using Arrays.asList() method: " + intList);

		
		//2. using Collections.addAll() method(less efficient but more flexible)------------------------------------------
		
		String[] wordsArray = {"java", "spring", "rest api", "oops"};

		System.out.println("\narray before conversion: " + Arrays.toString(wordsArray));
		List<String> wordsList = new ArrayList<>();
		
		Collections.addAll(wordsList, wordsArray);
		Collections.addAll(wordsList, "spring boot", "spring mvc", "maven");
		
		wordsList.add("eclipse IDE");
		wordsList.set(4, "programming");
		wordsList.remove(4);
		
		System.out.println("array to list using Collections.addAll() method: " + wordsList);
//------------------------------------------------------------------------------------------------------------------
	//convert from arraylist to array
		
		//1. using addAll() method
		List<String> programmingLangs = new ArrayList<>();
		System.out.println("\nfrom arrayList to array using addAll() method");
		
		//convert
		programmingLangs.addAll(Arrays.asList(wordsArray));
		
		//print
		System.out.println("arrayList: " + programmingLangs);
		System.out.println("array: " + Arrays.toString(wordsArray));
		
		
		//2. using toArray() method
		System.out.println("\nfrom arrayList to array using toArray() method");
		
		List<String> progLangs = Arrays.asList("java", "python", "c#", "c++");
		
		String[] progArray = new String[progLangs.size()];
		
		//convert
		progLangs.toArray(progArray);
		
		//print
		System.out.println("arrayList: " + progLangs);
		System.out.println("arrayList to array: " + Arrays.toString(progArray));
	}
	
	
	/*
	 - some points to remember when using Arrays.asList():
	 1. Once array is converted to list, the list becomes fixed. No data can be added or removed but can be updated
	 2. This method is efficient because it doesn't copy the content of the array to the list
	 
	 - some points to remember when using Collections.addAll():
	 3. This method is less efficient because it actually copies the content of the array into the arrayList
	 4. This method allows adding, removing and changing elements 
	 */
}