package practice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		//-------------------------------------------------------------creating a list
		//first way
		List<Integer> list1 = new ArrayList<>();
		
		//second way
		ArrayList<Integer> list2 = new ArrayList<>();
		
		//third way
		List<Integer> list3 = Arrays.asList(1, 2);
		
		//fourth way
		List<Integer> list4 = new ArrayList<>(List.of(2, 7));
		
		//-------------------------------------------------------------adding elements
		list1.add(54);
		list1.add(96);
		System.out.println("added an element to list1 using add method: " + list1);
		
		list2.add(0, 9);
		list2.add(1, 54);
		System.out.println("added an element to list2 using add method with index: " + list2);
		
		//-------------------------------------------------------------updating an element
		list3.set(1, 29);
		System.out.println("updating an element in list3 using set method: " + list3);
		
		//-------------------------------------------------------------retrieving an element
		System.out.println("retrieving an element from list4 using get method: " + list4.get(1));
		
		//-------------------------------------------------------------removing an element
		System.out.println("removing an element from list4 using remove method. Removed element= " + list4.remove(0));
		
		//-------------------------------------------------------------getting the length of a list
		System.out.println("finding the size of list3 using size method. Size of list3= " + list3.size());
		
		//creating a list of n copies of the same element
		List<Integer> list5 = Collections.nCopies(5, 29);
		System.out.println("list5 = " + list5);
		
		//-------------------------------------------------------------cloning a list
		List<Integer> nums = new ArrayList<>();
		nums.add(8); nums.add(5);
		List<Integer> nums2 = nums;
		nums2.add(76);
		
		//assigning nums1 to the new list nums2 means we assign to it reference of the same object in list1
		//therefore, any change in any list, means a change in both
		System.out.println(nums + "" + nums2);
		
		//-------------------------------------------------------------list to array
		List<Integer> nums1 = new ArrayList<>(List.of(1, 56));
		Integer[] toArray = nums1.toArray(new Integer[0]);
		
		//-------------------------------------------------------------sorting a list
		List<Integer> list6 = new ArrayList<>(List.of(1,2,6,4,52,-12,0,22));
		Collections.sort(list6);
		System.out.println("list6 sorted: " + list6);
	}
}
