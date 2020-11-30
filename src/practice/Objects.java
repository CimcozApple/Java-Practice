package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Objects {
	
	//here we try add objects in a collection
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(2028, "web developer"));
		employees.add(new Employee(2025, "software engineer"));
		employees.add(new Employee(2024, "hr"));
		employees.add(new Employee(2027, "secretary"));
	
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		//sorting results using Collections.sort and lambda expression

		System.out.println("\nUsing lambda expression");
		Collections.sort(employees,(e1, e2) ->{
			if(e1.id > e2.id) {
				return 1;
			}
			return -1;
		});
		
		for(Employee e : employees)
		System.out.println(e);
		
		
	}
	
}
