package practice.count;

public class Count {
	
	public static void main(String[] args) {
	//count number of digits
		//1. convert to String then get the length
		System.out.println("converting to String then geting the length");
		int num = 24564532;
		
		//convert integer to String
		String something = Integer.toString(num);
		
		//get the string's length
		int length = something.length();
		
		System.out.println("number of digits in '" + num + "' = " + length);
		
		
		//2. using while loop
		System.out.println("\ncounting digits using while loop");
		int count = 0;
		
		while(num > 0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits = " + count);
	}

}
