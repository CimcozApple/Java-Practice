package practice.list.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class SolutionWithLambda {

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
			Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
			
			//step 2 - method that prints all elements in list
			printAll(people);
			
			//step 3 - method that prints people whose name end with r
			System.out.println("\nprinting elements whose names end with r");
			printWithCondition(people, (p) -> p.getName().endsWith("r"));
		}
	

	//for step2
	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}
	
	//for step3
	private static void printWithCondition(List<Person> people, Predicate<Person> predicate) {
		System.out.println("print");
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
		
	}

}
