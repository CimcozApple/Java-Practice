package practice.numbers;

import java.util.ArrayList;
import java.util.List;

public class PrintRoman {

	public static void main(String[] args) {
		String s = convertToRoman(100);
		System.out.println(s);
		
	}


	public static String convertToRoman(int num) {
		String[] thousands = {"", "M", "MM"};
		String[] hundreds = {"", "C", "CC", "CCC", "CD", "DC", "DCC", "DCCC", "CM"};
		String[] tens = {"", "X","XX", "XXX", "XL", "LX", "LXX", "LXXX", "XC"};
		String[] units = {"", "I", "II", "III", "IV", "VI", "VII", "VIII", "IX"};
		
		return thousands [num / 1000] + hundreds[(num % 1000) / 100] + tens [(num % 100) / 10] + units [num % 10];  
		
	}
}