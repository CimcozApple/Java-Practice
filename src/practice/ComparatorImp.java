package practice;

import java.util.Comparator;

public class ComparatorImp implements Comparator<Integer> {
	
	@Override
	public int compare(Integer num1, Integer num2) {
		if(num1 > num2) {
			return 1;
		}
		return -1;
	}
	
	public int compare2(Integer num3, Integer num4) {
		if(num3%10 > num4%10) {
			return 1;
		}
		return 0;
	}


}
