package practice.interview;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int input = 24568,
		result, 
		reverse = 0;
		
		while(input != 0) {
			reverse = reverse * 10 + (input % 10);
			input /= 10;
		}
		String s = stuff(2000);
		System.out.println(s);
	}
	
	public static String stuff(int num) {
	
	String[] thousands = {"", "M", "MM"};
	String[] hundreds = {"", "C", "CC", "CCC", "CD", "DC", "DCC", "DCCC", "CM"};
	String[] tens = {"", "X","XX", "XXX", "XL", "LX", "LXX", "LXXX", "XC"};
	String[] units = {"", "I", "II", "III", "IV", "VI", "VII", "VIII", "IX"};
	
	return thousands [num / 1000] + hundreds[(num % 1000) / 100] + tens [(num % 100) / 10] + units [num % 10];  
	
	}
}
