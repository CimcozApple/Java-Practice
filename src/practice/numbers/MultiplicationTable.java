package practice.numbers;

public class MultiplicationTable {

	//print multiplication table of a given number
	public static void main(String[] args) {
		
	
		int num = 5;
		int result;
		//using for loop
		System.out.println("using for loop:");
		for(int i = 0; i <=5;  i++) {
			result = i * num;
			System.out.println(num + " * " + i + " = " + result);
		}
		
		//using while loop
		int j = 0;
		int multiple = 0;
		System.out.println("\nusing while loop:");
		while(j <= num) {
			j++;
			multiple = num * j;
			System.out.println(num + " * " + j + " = " + multiple);
		}
	}	
}
