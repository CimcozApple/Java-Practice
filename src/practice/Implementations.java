package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Implementations {
	
	public static void main(String[] args) {
	
	//this class shows how to implement an interface
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(6);
		numbers.add(51);
		numbers.add(4);
		numbers.add(20);
		numbers.add(12);
	
	// first method, when declaring an object
		System.out.println("using implementation class as object");
		Comparator<Integer> comparisons = new ComparatorImp();
		
		numbers.sort(comparisons);
		System.out.println(numbers);
	
	//	using ananymous class
		System.out.println("\nusing ananymous class");
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer number1, Integer number2) {
				
				if(number1%10 < number2%10) {
					return -1;
				}
				return 1;
			}
		};
		numbers.sort(com);
		System.out.println(numbers);
		
		
	// using lambda expression
		System.out.println("\nusing lambda expression");
		Comparator<Integer> coms = (no1, no2) -> {
			if(no1 > no2) {
				return -1;
			}
			return 1;
		};
		
		numbers.sort(coms);
		System.out.println(numbers);
		
	}
}
