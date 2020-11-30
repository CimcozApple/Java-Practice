package practice;

import java.util.*;

public class Practice1 {
	
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		
		stringList.add("tesla automotive");
		stringList.add("tesla solar");
		stringList.add("boring");
		stringList.add("spaceX");
		stringList.add("starlink");
		
		System.out.println("-----------------using forEach loop-----------------");
		for(String i : stringList) {
			System.out.println(i);
		}
		
		System.out.println("-----------------using iterator-----------------");
		Iterator<String> itr = stringList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// how to sort elements in collection
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(87);
		numbers.add(61);
		numbers.add(50);
		numbers.add(89);
		numbers.add(95);
		numbers.add(104);
		
		//collections.sort method
		System.out.println("\n-----------------using Collections.sort() method-----------------");
		System.out.println("-----------------sort by first digit");
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println("-----------------sort in reverse");
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		
		//using comparator interface to sort by first digit
		System.out.println("\n-----------------using comparator interface-----------------");
		System.out.println("-----------------sort by first digit");
		Comparator<Integer> com = new ComparatorImp();
		
		numbers.sort(com);
		
		System.out.println(numbers);
		
		//using comparator interface to sort by last digit
		System.out.println("\n-----------------using comparator interface-----------------");
		System.out.println("-----------------sort by last digit");
//		//we can try using ananymous class
		Comparator<Integer> com2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer num3, Integer num4) {
				if(num3%10 > num4%10) {
					return 1;
				}
				return -1;
			}
		}; 
		numbers.sort(com2);
		
		System.out.println(numbers);
	}
	
	
}
