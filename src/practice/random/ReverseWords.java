package practice.random;

public class ReverseWords {

	//reverse words in a string
	public static void main(String[] args) {
		
		String sentence = "reverse this string";
		String reverse = "";
		
		for(int j = sentence.length()-1; j>=0; j--) {
			reverse = reverse + sentence.charAt(j);
		}
		System.out.println("reversed string = " + reverse);
	}	
}
