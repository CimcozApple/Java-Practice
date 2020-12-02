package practice.string;

public class CountVowelConstant {

	public static void main(String[] args) {
	//count the number of vowels and constants in a string
		
		//String
		String something = "heloooo";
		
		//convert to character array
		char[] letters = something.toCharArray();
		
		int count = 0, count2 = 0;
		
		//use for loop and if statement
		for(char c : letters) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
			else count2++;
		}
		System.out.println("'" + something + "' has " + count + " vowels and " + count2 + " constants");

	//print vowels and constants	
		for(char i : letters) {
			if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
				System.out.println("vowel: " + i);
			} else {
				System.out.println("constant: " + i);
			}	
		}
	}	
}
