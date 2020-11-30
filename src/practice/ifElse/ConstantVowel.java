package practice.ifElse;

public class ConstantVowel {

	//check whether an alphabet is constant or vowel
	public static void main(String[] args) {
		char check = 'd';
		//first way
		if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
			System.out.println("'" + check + "' is vowel");
			
		} else {
			
			System.out.println("'" + check + "' is constant");
		}
		
		//second way
		checkIfConstantOrVowel('f');
		System.out.println(check);
	}
	
	public static void checkIfConstantOrVowel(char check) {
		if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
			System.out.println("'" + check + "' is vowel");
			
		} else {
			
			System.out.println("'" + check + "' is constant");
		}
	}
}
