package practice.interview;

public class ReverseString {

	//Reverse a string
	
	//first approach - directly in main method
	public static void main(String[] args) {
		
		String something = "practice";
		
		StringBuilder str = new StringBuilder(something);					//mutable string that provides API to manipulate a string
		
		System.out.println("first approach: " + str.reverse().toString());	//reversing the string
		
		
	// second approach - call a method
	System.out.println("second approach: " + reverseString(something));
	
	//third approach - manually
		for(int i = something.length() - 1; i>=0; i-- ) {						// just use for loop in reverse
			System.out.print(something.charAt(i));
		}
	}
	
	
	public static String reverseString(String something) {
		return new StringBuilder(something).reverse().toString();
	}
}
