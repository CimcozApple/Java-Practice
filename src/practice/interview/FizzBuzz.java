package practice.interview;

public class FizzBuzz {

	public static void main(String[] args) {
		
		/*Write a program that prints a number from 1 to 100 in new line.
		 For each multiple of 3, print "fizz" instead of a number.
		 For each multiple of 5, print "buzz" instead of a number.
		 For each multiple of both 3 and 5, print "fizz buzz". */
		
		printFizzBuzz(100);
		
	}
		
	public static void printFizzBuzz(int n) {
		
		for(int i= 1; i <= n; i++) {
			if(i  %  3 == 0 && i  %  5 == 0) {
				System.out.println("fizz buzz");
			}
			else if(i  %  3 == 0) {
				System.out.println("Fizz");
			}
			else if( i  %  5 == 0) {
				System.out.println("buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
	
}
