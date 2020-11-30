package practice.list.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionWithInnerClass {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Sami", 28, "Engineer"),
				new Person("Amir", 34, "Journalist"),
				new Person("Rashid", 42, "HR"),
				new Person("Yasir", 36, "Doctor"),
				new Person("Omar", 27, "IT support"),
				new Person("Samir", 25, "Engineer")
				);
	
		//step 1 - Sort list by name;
	
			//anonymous inner class
			Collections.sort(people, new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
		
		//step 2 - method that prints all elements in list
			System.out.println("\nprinting elements in the list");
			printAll(people);
		
		//step 3 - method that prints people whose name end with r
			System.out.println("\nprinting elements whose names end with r");
			printWithCondition(people, new Condition() {
				
				@Override
				public boolean apply(Person p) {
					return p.getName().endsWith("r");
				}
			});
		}
	
	
		//for step 2
		private static void printAll(List<Person> people) {
			for(Person p : people) {
				System.out.println(p);
			}
		}
		
		//for step 3 we have to create a condition interface 
		private static void printWithCondition(List<Person> people, Condition condition) {
			for(Person p : people) {
				if(condition.apply(p)) {
					System.out.println(p);
				}
			}
			
	}
}

//for step 3
interface Condition{
	boolean apply(Person p);
}
