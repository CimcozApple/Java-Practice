package practice;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListVsSet {

	public static void main(String[] args) {
		/*List and Set have similar functions. The main difference is that Set does not support duplicate elements.
		 The second difference is that Set prints values in certain sequence */
		 
		List<Integer> numbers = new ArrayList<>();
		numbers.add(90);
		numbers.add(58);
		numbers.add(194);
		numbers.add(45);
		numbers.add(76);
		
		System.out.println(numbers.size());

		System.out.println("-----------------------------------List without order\n" + numbers);
//		Comparator<Integer> com = (num1, num2) -> {
//			if(num1 > num2) {
//				return -1;
//			}
//			return 1;
//		};
		System.out.println("\n-----------------------------------List sorted");
		Collections.sort(numbers);
		System.out.println(numbers);
			
		//list using forEach
		System.out.println("\n-----------------------------------print elements using forEach");
		numbers.stream().forEach(i -> System.out.println(i));
		
		
		System.out.println("\n-----------------------------------Set without order");	
		Set<Integer> nums = new HashSet<>();
		nums.add(90);
		nums.add(58);
		nums.add(194);
		nums.add(45);
		nums.add(76);
		
		System.out.println(nums);
		
		System.out.println("\n-----------------------------------Set sorted");
		Set<Integer> nums2 = new TreeSet<>();
		nums2.add(90);
		nums2.add(58);
		nums2.add(194);
		nums2.add(45);
		nums2.add(76);
		
		System.out.println(nums2);
		
		System.out.println("\n-----------------------------------SortedSet");
		
		SortedSet<String> set =  new TreeSet<String>();
		
		set.add("r");
		set.add("g");
		set.add("b");
		set.add("b");
		set.add("v");
		for(String s : set) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n-----------------------------------linkedList");
		List<String> strings = new LinkedList<>();
		strings.add("hi");
		strings.add("hi");
		for(String s : strings) {
			System.out.println(s);
		}
		
		System.out.println("\n-----------------------------------hashcode");
		
		List<Integer> test = new ArrayList<>();
				
		System.out.println(test.hashCode());
		System.out.println(test.equals(strings));
		System.out.println(strings.get(1));
	}
	
//		public void linkBefore(E e, Node<String> succ) {
//	        // assert succ != null;
//	        final Node<E> pred = succ.prev;
//	        final Node<String> newNode = new Node<>(pred, e, succ);
//	        succ.prev = newNode;
//	        if (pred == null)
//	            first = newNode;
//	        else
//	            pred.next = newNode;
//	        size++;
//	        modCount++;
//	    }
	
	
	
}


