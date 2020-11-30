package practice.stream;

import java.util.Arrays;
import java.util.List;

public class Something extends C implements A {

	public static void main(String[] args) {
		A a = new Something();
		a.test();
		
		
		//this part is for testing forEach loop
		List<Integer> numbers = Arrays.asList(5,6,7,8);
		
		numbers.forEach(i -> System.out.println(i));
	}
}
