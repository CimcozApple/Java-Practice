package practice.arrays.copy;

import java.util.Arrays;

public class CopyArray {
	
	//copy arrays
	public static void main(String[] args) {
		//1. copy an array using clone method
		
		int[] originalArr = {2, 6, 4, 2, 7, 44, 73, -3, 0, 20, 75};
		
		int[] clonedArr = originalArr.clone();
		
		System.out.println("------------------------------------------------------cloning an array");
		
		System.out.println("original array: " + Arrays.toString(originalArr));
		
		System.out.println("cloned array: " + Arrays.toString(clonedArr));
		
		//with this method, each array is independent. Any change in one array doesn't affect the other
		System.out.println("\n------------------------------------------------------modifying an array");
		
		originalArr[7] = 80;
		
		clonedArr[4] = -5;
		
		System.out.println("original array after modification: " + Arrays.toString(originalArr));
		
		System.out.println("cloned array after modification: " + Arrays.toString(clonedArr));
		
		
		
		
	//------------------------------------------------------------------------------------------------------------
		
		
		//2. copy an array by assigning a new reference to the original array
		System.out.println("\n------------------------------------------------------assiging new reference to the original array");
		
		int[] firstArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] secondArr = firstArr;

		System.out.println("first array: " + Arrays.toString(firstArr));
		
		System.out.println("second array: " + Arrays.toString(secondArr));
		
		//notice that both arrays are affected with the same change because both refer to the same elements
		System.out.println("\n------------------------------------------------------modifying an array");
		
		firstArr[2] = 40;
		
		secondArr[0] = -6;
		
		System.out.println("first array after modification: " + Arrays.toString(firstArr));
		
		System.out.println("second array after modification: " + Arrays.toString(secondArr));
		
		
		
		
		//------------------------------------------------------------------------------------------------------------
		
		
		//3. Another way to clone arrays
		System.out.println("\n------------------------------------------------------using for loop");
		int[] array1 = {9,8,7,6,5,4,3,2,1};
		
		int[] array2 = new int[array1.length];
		
		for(int x = 0; x <array1.length; x++) {
			array2[x] = array1[x];
		}
		System.out.println("array1: " + Arrays.toString(array1));
		
		System.out.println("array2: " + Arrays.toString(array2));
		
		//notice each array is not affected by a change in the other array because they are independent
		System.out.println("\n------------------------------------------------------modifying an array");
		
		array1[2] = -89;
		array2[5] = -4;
		System.out.println("array1 after modification: " + Arrays.toString(array1));
		
		System.out.println("array2 after modification: " + Arrays.toString(array2));
	}

}
