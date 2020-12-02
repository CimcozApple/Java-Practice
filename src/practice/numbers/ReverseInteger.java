package practice.numbers;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int input = 12345,
		reverse = 0;
		
		while(input != 0) {
			
			reverse = reverse * 10 + (input % 10);
			
			input /= 10;
		}
		System.out.println(reverse);
	}
}
