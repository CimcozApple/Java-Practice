package practice.arrays.search;

public class FindAverage {

	//calculate average

	public static void main(String[] args) {
		
		//initialize an array
		
		int[] getAvg = {1,2,3,4,5,6,7,8,9};
	
		//get the length
		int length = getAvg.length;
		
		double average;
		
		int sum = 0;
		
		//for loop
		for(int i = 0; i < getAvg.length; i++) {
			
			sum = sum + getAvg[i];			 
		}
		average = sum / length;
		
		System.out.println(average);
	}
	
}
